package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Weapon {

    private String type;
    private String name;
    private Integer damage;
    private Long durability;
    private List<String> perks;

    private Weapon(final String type, final String name, final Integer damage, final Long durability, final List<String> perks) {
        this.type = type;
        this.name = name;
        this.damage = damage;
        this.durability = durability;
        this.perks = perks;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(final Integer damage) {
        this.damage = damage;
    }

    public Long getDurability() {
        return durability;
    }

    public void setDurability(final Long durability) {
        this.durability = durability;
    }

    public List<String> getPerks() {
        return perks;
    }

    public void setPerks(final List<String> perks) {
        this.perks = perks;
    }

    public static class Builder {
        private String type;
        private String name;
        private Integer damage;
        private Long durability;
        private List<String> perks = new ArrayList<>();

        // configuring methods
        public Builder withType(final String type) {
            this.type = type;
            return this;
        }

        public Builder withName(final String name) {
            this.name = name;
            return this;
        }

        public Builder withDamage(final Integer damage) {
            this.damage = damage;
            return this;
        }

        public Builder withDurability(final Long durability) {
            this.durability = durability;
            return this;
        }

        public Builder withPerks(final List<String> perks) {
            this.perks = perks;
            return this;
        }

        // creates the target object
        public Weapon build() {
            return new Weapon(type, name, damage, durability, perks);
        }
    }
}
