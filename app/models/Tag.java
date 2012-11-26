package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

/**
 * 
 */
@Entity 
public class Tag extends Model {

    @Id @GeneratedValue
    public Long id;

    @Constraints.Required
    public String name;

    public static Model.Finder<Long,Tag> find = new Model.Finder(Long.class, Tag.class);

   @ManyToMany(cascade = CascadeType.ALL)
   public List<Product> products;

    public String toString() {
        return id != null ? id.toString() : "-1";
    }
}