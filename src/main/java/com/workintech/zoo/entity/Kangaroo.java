package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Kangaroo {
    //id, name, height, weight, gender, isAggressive
    private int id;
    private String name;
    private Double height;
    private Double weight;
    private String gender;
    private boolean isAggressive;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getHeight() {
        return this.height;
    }

    public Double getWeight() {
        return this.weight;
    }

    public String getGender() {
        return this.gender;
    }

    public boolean getIsAggressive() {
        return this.isAggressive;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIsAggressive(boolean isAggressive) {
        this.isAggressive = isAggressive;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Kangaroo)) return false;
        final Kangaroo other = (Kangaroo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$height = this.getHeight();
        final Object other$height = other.getHeight();
        if (this$height == null ? other$height != null : !this$height.equals(other$height)) return false;
        final Object this$weight = this.getWeight();
        final Object other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !this$weight.equals(other$weight)) return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false;
        if (this.getIsAggressive() != other.getIsAggressive()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Kangaroo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $height = this.getHeight();
        result = result * PRIME + ($height == null ? 43 : $height.hashCode());
        final Object $weight = this.getWeight();
        result = result * PRIME + ($weight == null ? 43 : $weight.hashCode());
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        result = result * PRIME + (this.getIsAggressive() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "Kangaroo(id=" + this.getId() + ", name=" + this.getName() + ", height=" + this.getHeight() + ", weight=" + this.getWeight() + ", gender=" + this.getGender() + ", isAggressive=" + this.getIsAggressive() + ")";
    }
}
