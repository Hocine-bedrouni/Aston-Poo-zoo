package zoo.classes;

import zoo.interfaces.IAnimal;
import zoo.interfaces.INageur;
import zoo.interfaces.IVolatile;
import zoo.interfaces.Iconteneur;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Conteneur<Aquarium, INageur>> listeAquarium = new ArrayList<>();
    List<Conteneur<Voliere, IVolatile>> listeVoliere = new ArrayList<>();
    List<Conteneur<Cage, IAnimal>>listeCage = new ArrayList<>();


    public Zoo(){
        this.addVoliere(new Conteneur<Voliere, IVolatile>(5));
        this.addAquarium(new Conteneur<Aquarium, INageur>(5));
        this.addCage(new Conteneur<Cage, IAnimal>(5));
    }

    public List<Conteneur<Aquarium, INageur>> getListeAquarium() {
        return listeAquarium;
    }

    public void setListeAquarium(List<Conteneur<Aquarium, INageur>> listeAquarium) {
        this.listeAquarium = listeAquarium;
    }

    public List<Conteneur<Voliere, IVolatile>> getListeVoliere() {
        return listeVoliere;
    }

    public void setListeVoliere(List<Conteneur<Voliere, IVolatile>> listeVoliere) {
        this.listeVoliere = listeVoliere;
    }

    public List<Conteneur<Cage, IAnimal>> getListeCage() {
        return listeCage;
    }

    public void setListeCage(List<Conteneur<Cage, IAnimal>> listeCage) {
        this.listeCage = listeCage;
    }

    public void addVoliere(Conteneur<Voliere, IVolatile> voliere){
       this.listeVoliere.add(voliere);
    }
    public void addAquarium(Conteneur<Aquarium, INageur> aqarium){
        this.listeAquarium.add(aqarium);
    }
    public void addCage(Conteneur<Cage, IAnimal> cage){
        this.listeCage.add(cage);
    }

}
