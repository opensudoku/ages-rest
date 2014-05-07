/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mark
 */
@Entity
@Table(name = "AGES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ages.findAll", query = "SELECT a FROM Ages a"),
    @NamedQuery(name = "Ages.findById", query = "SELECT a FROM Ages a WHERE a.id = :id"),
    @NamedQuery(name = "Ages.findByName", query = "SELECT a FROM Ages a WHERE a.name = :name"),
    @NamedQuery(name = "Ages.findByAge", query = "SELECT a FROM Ages a WHERE a.age = :age"),
    @NamedQuery(name = "Ages.findByCivilMilitary", query = "SELECT a FROM Ages a WHERE a.civilMilitary = :civilMilitary"),
    @NamedQuery(name = "Ages.findByCategory", query = "SELECT a FROM Ages a WHERE a.category = :category"),
    @NamedQuery(name = "Ages.findByColor", query = "SELECT a FROM Ages a WHERE a.color = :color"),
    @NamedQuery(name = "Ages.findByUpperRight", query = "SELECT a FROM Ages a WHERE a.upperRight = :upperRight"),
    @NamedQuery(name = "Ages.findByContent", query = "SELECT a FROM Ages a WHERE a.content = :content"),
    @NamedQuery(name = "Ages.findByRemark", query = "SELECT a FROM Ages a WHERE a.remark = :remark")})
public class Ages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 21)
    @Column(name = "NAME")
    private String name;
    @Column(name = "AGE")
    private Integer age;
    @Size(max = 6)
    @Column(name = "CIVIL_MILITARY")
    private String civilMilitary;
    @Size(max = 6)
    @Column(name = "CATEGORY")
    private String category;
    @Size(max = 9)
    @Column(name = "COLOR")
    private String color;
    @Size(max = 9)
    @Column(name = "UPPER_RIGHT")
    private String upperRight;
    @Size(max = 104)
    @Column(name = "CONTENT")
    private String content;
    @Size(max = 32)
    @Column(name = "REMARK")
    private String remark;

    public Ages() {
    }

    public Ages(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCivilMilitary() {
        return civilMilitary;
    }

    public void setCivilMilitary(String civilMilitary) {
        this.civilMilitary = civilMilitary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUpperRight() {
        return upperRight;
    }

    public void setUpperRight(String upperRight) {
        this.upperRight = upperRight;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ages)) {
            return false;
        }
        Ages other = (Ages) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Ages[ id=" + id + " ]";
    }
    
}
