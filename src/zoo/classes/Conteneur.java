package zoo.classes;


import zoo.interfaces.Iconteneur;

import java.util.ArrayList;
import java.util.List;

// !!!!!!T correspond au type d'objet et U au type d'attribut ou de methode!!!!!!
 public class Conteneur <T,U> implements Iconteneur {

        private int quantite;
        List<U> liste  = new ArrayList<>(0);

    //Récupère le type d'objet pour fair la comparaison avec un autre type


    //Construtceur

//    public Conteneur(int quantite, Class<T> type) throws Exception {
//            this.setQuantite(quantite);
//        this.type = type;
//    }

    public Conteneur(int quantite) {
        this.quantite = quantite;
    }

    public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) throws Exception {
            if(liste.size()> quantite) throw  new Exception("quantité inférieur au nombre d'animaux dans la cage");
            this.quantite = quantite;
        }

        public List<U> getListe() {
            return liste;
        }

        public void ajouter(U param) throws Exception {
            if (liste.size()>+ quantite) throw new Exception("capacité max atteinte");
            this.liste.add(param);
        }

    public void checkConteneur() {
        System.out.println(liste.size());
    }


//    @Override
//    public String toString() {
//        return "Conteneur{" +
//                "quantite=" + quantite +
//                ", liste=" + liste +
//                '}';
//    }
}


