package LAB7;

/**
 * Created by niervin on 9/30/2016.
 */

public abstract class RPGCharacter {
    //need changes and improvements

        private String name;
        private int hp;
        private int mana;

        public RPGCharacter(String name) {
            this.name = name;
        }

        // implement in subclass
        public abstract int attack(int choice);

        // checks to see if character is still alive
        public boolean isAlive() {
            return hp > 0 ? true : false;
        }

        // may be overriden in subclass, damage is dependent on hero type
        public int takeDamage(int damage) {
            hp -= damage;
            return hp;
        }

        public int minusMana(int special){
            mana -= special;
            return mana;
        }


        // getters setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public int getMana() { return mana; }

        public void setMana(int mana) { this.mana = mana; }
        @Override
        public String toString() {
            if(hp < 0){
                hp = 0;
            }
            return "LAB7.RPGCharacter{" +
                    "name='" + name + '\'' +
                    ", hp=" + hp +
                    '}';
        }
    }
