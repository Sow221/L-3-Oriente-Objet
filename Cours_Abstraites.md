# Module : Classes et Méthodes Abstraites en Java

## 1. Introduction

En programmation orientée objet, une **classe abstraite** est une classe qui sert de modèle pour d'autres classes mais qui **ne peut pas être instanciée directement**. Elle permet de définir un **comportement général** tout en laissant certaines méthodes à implémenter dans les sous-classes.

Une **méthode abstraite** est une méthode déclarée sans corps, dont la définition doit être fournie par chaque sous-classe concrète. Les classes abstraites sont très utiles pour structurer des hiérarchies de classes et pour appliquer le polymorphisme.

---

## 2. Définition

### Classe abstraite

* Une classe déclarée avec le mot-clé `abstract`.
* Ne peut pas être instanciée : `new Animal()` est interdit si `Animal` est abstrait.
* Peut contenir :

  * des méthodes **abstraites** (sans corps)
  * des méthodes **concrètes** (avec corps)

```java
abstract class Animal {
    abstract void parler(); // méthode abstraite
    void manger() {         // méthode concrète
        System.out.println("L'animal mange");
    }
}
```

### Méthode abstraite

* Déclarée avec `abstract` et sans corps.
* Doit être redéfinie dans **toutes les sous-classes concrètes**.
* Permet de forcer un comportement spécifique dans chaque sous-classe.

---

## 3. Création de sous-classes concrètes

```java
class Chien extends Animal {
    @Override
    void parler() {
        System.out.println("Le chien aboie");
    }
}

class Chat extends Animal {
    @Override
    void parler() {
        System.out.println("Le chat miaule");
    }
}
```

* Les sous-classes concrètes **doivent implémenter toutes les méthodes abstraites**.
* Elles peuvent hériter directement des méthodes concrètes.

---

## 4. Polymorphisme avec classes abstraites

```java
public class Test {
    public static void main(String[] args) {
        Animal a1 = new Chien();
        Animal a2 = new Chat();

        a1.parler(); // Le chien aboie
        a2.parler(); // Le chat miaule
        a1.manger(); // L'animal mange
    }
}
```

**Explications** :

* `parler()` est abstraite → polymorphisme → la méthode exécutée dépend de l’objet réel.
* `manger()` est concrète → héritée directement de `Animal`.

---

## 5. Règles importantes

1. Une **classe abstraite ne peut pas être instanciée**.
2. Si une classe a au moins **une méthode abstraite**, elle doit être déclarée `abstract`.
3. Une **sous-classe concrète doit redéfinir toutes les méthodes abstraites**.
4. Une **classe abstraite peut avoir des méthodes concrètes**.
5. Le polymorphisme fonctionne avec les classes abstraites :

```java
Animal a = new Chien();
a.parler(); // exécution selon l'objet réel
```

---

## 6. Exemple complet avec plusieurs niveaux

```java
abstract class Animal {
    abstract void parler();
    void manger() { System.out.println("L'animal mange"); }
}

abstract class Mammifere extends Animal {
    abstract void courir();
}

class Chien extends Mammifere {
    @Override
    void parler() { System.out.println("Le chien aboie"); }

    @Override
    void courir() { System.out.println("Le chien court"); }
}

class Chat extends Mammifere {
    @Override
    void parler() { System.out.println("Le chat miaule"); }

    @Override
    void courir() { System.out.println("Le chat court"); }
}

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Chien();
        Mammifere m1 = new Chat();

        a1.parler(); // Le chien aboie
        m1.parler(); // Le chat miaule
        a1.manger(); // L'animal mange
        m1.courir(); // Le chat court
    }
}
```

* Hiérarchie : `Animal` → `Mammifere` → `Chien` / `Chat`
* Polymorphisme avec références abstraites.

---

## 7. Exercices pratiques

1. **Vehicule abstrait**

   * Créer une classe abstraite `Vehicule` avec :

     * méthode abstraite `demarrer()`
     * méthode concrète `stopper()` affichant "Le véhicule s'arrête"
   * Créer deux sous-classes concrètes : `Voiture` et `Moto` implémentant `demarrer()`.

2. **Forme abstraite**

   * Créer une classe abstraite `Forme` avec :

     * méthode abstraite `aire()`
     * méthode concrète `description()`
   * Sous-classes : `Rectangle` et `Cercle`
   * Créer un tableau `Forme[]` et appeler `aire()` sur chaque élément.

3. **Exercice de polymorphisme avancé**

   * Créer une classe abstraite `Employe` avec méthode abstraite `calculerSalaire()`
   * Sous-classes `Commercial`, `Technicien`, `Manager` implémentant `calculerSalaire()` différemment
   * Tester le polymorphisme avec un tableau `Employe[]`.

---

## 8. Schéma résumé

```
          +--------------------+
          |     Animal         |  ← classe abstraite
          +--------------------+
          | abstract parler()  |  ← méthode abstraite
          | manger()           |  ← méthode concrète
          +--------------------+
                   ▲
       ┌───────────┴───────────┐
       ▼                       ▼
+---------------+       +---------------+
|     Chien     |       |      Chat     |  ← sous-classes concrètes
+---------------+       +---------------+
| parler()      |       | parler()      |  ← méthode redéfinie
| (hérite manger)|      | (hérite manger)| 
+---------------+       +---------------+
```

* Les classes concrètes peuvent être instanciées.
* Les méthodes abstraites doivent être implémentées.
* Le polymorphisme fonctionne avec les références de type abstrait.

---

## 9. Points clés pour l’examen

* `abstract` = classe ou méthode abstraite
* **Surcharge (overloading)** vs **redéfinition (overriding)**
* Polymorphisme → la méthode exécutée dépend de l’**objet réel**
* Une méthode abstraite force la sous-classe à l’implémenter
* Les classes abstraites peuvent contenir des méthodes concrètes

---

**Fin du module**
