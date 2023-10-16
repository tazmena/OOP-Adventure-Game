Student name: Tazmena Hussain
Student number: 200340373

Now complete the statements below for each level you wish to be marked. Replace all text in square brackets.

LEVEL ONE

My code demonstrates inheritance in the following way...

I have a superclass called Character.

This superclass is extended into at least two subclasses called Hero and Villian. Hero is extended into Warrior and Mage. Mage is extended into FireMage and IceMage.

For each of the named subclasses complete the following...

Subclass 1.

Subclass Warrior extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are randomStrength.

These/this new properties/property are used by the subclass in the following way:
The variable randomStrength is used to store generated a random number and add this onto the warrior's current strength. It is used to make the warrior's strength higher than the Mages' when using "attack". 
The line number where it is used in Warrior class is: Line 11

Subclass Warrior extends the superclass by overriding the following methods (there must be at least one): attack method, line 20 in Warrior class.

These overridden methods are used in the working code in the following places: StartGame class, line 108.

Subclass 2.

Subclass FireMage extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are magicType.

These/this new properties/property are used by the subclass in the following way:
MagicType is used to determine the type of magic the mage is throwing, depending on if it is ice or fire. This will be used to break the villain's barrier. Eg. only ice magic can break a fire barrier.

Subclass FireMage extends the superclass by overriding the following methods (there must be at least one): throwMagic, FireMage class, line 14.

These overridden methods are used in the working code in the following places: StartGame class, line 123.


LEVEL TWO

Polymorphism consists of the use of the Substitution principle and Late Dynamic binding.

In my code, polymorphism is implemented in at least two places…

Example 1.

The substitution principle can be seen in use in startGame, line 27. The name of the superclass used in this example is Hero and the subclasses used are Warrior.

Late dynamic binding can be seen in StartGame, line 109.

This is necessary in my code because each attack from each different type of hero (Warrior, fire mage, and ice mage) do different things (eg different output messages, or different attack power). Therefore, polymorphism must be used to give each attack a different function.

Example 2.

The substitution principle can be seen in use in startGame, line 28. The name of the superclass used in this example is Hero and the subclasses used are FireMage.

Late dynamic binding can be seen in StartGame, 123.

This is necessary because both mages are able to throwMagic, however, the magicType must be determined in order to function properly (such as needing a specific magic type to break the villain's barrier). Therefore, polymorphism is used to give "throwMagic" a different function for each call, and different output.
