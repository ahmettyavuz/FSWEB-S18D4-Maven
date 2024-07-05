package com.workintech.s18d1.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "burger", schema = "fsweb")
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "is_vegan")
    private Boolean isVegan;

    @Column(name = "bread_type")
    @Enumerated(EnumType.STRING)
    private BreadType breadType;

    @Column(name = "contents")
    private String contents;

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public Boolean getIsVegan() {
        return this.isVegan;
    }

    public BreadType getBreadType() {
        return this.breadType;
    }

    public String getContents() {
        return this.contents;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setIsVegan(Boolean isVegan) {
        this.isVegan = isVegan;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Burger)) return false;
        final Burger other = (Burger) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$isVegan = this.getIsVegan();
        final Object other$isVegan = other.getIsVegan();
        if (this$isVegan == null ? other$isVegan != null : !this$isVegan.equals(other$isVegan)) return false;
        final Object this$breadType = this.getBreadType();
        final Object other$breadType = other.getBreadType();
        if (this$breadType == null ? other$breadType != null : !this$breadType.equals(other$breadType)) return false;
        final Object this$contents = this.getContents();
        final Object other$contents = other.getContents();
        if (this$contents == null ? other$contents != null : !this$contents.equals(other$contents)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Burger;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $id = this.getId();
        result = result * PRIME + (int) ($id >>> 32 ^ $id);
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $isVegan = this.getIsVegan();
        result = result * PRIME + ($isVegan == null ? 43 : $isVegan.hashCode());
        final Object $breadType = this.getBreadType();
        result = result * PRIME + ($breadType == null ? 43 : $breadType.hashCode());
        final Object $contents = this.getContents();
        result = result * PRIME + ($contents == null ? 43 : $contents.hashCode());
        return result;
    }

    public String toString() {
        return "Burger(id=" + this.getId() + ", name=" + this.getName() + ", price=" + this.getPrice() + ", isVegan=" + this.getIsVegan() + ", breadType=" + this.getBreadType() + ", contents=" + this.getContents() + ")";
    }
}