package zoo;

import zoo.classes.*;
import zoo.interfaces.IAnimal;
import zoo.interfaces.INageur;
import zoo.interfaces.IVolatile;

import java.lang.reflect.ParameterizedType;


public class Main {
    public static void main(String[] args) throws Exception {

        Conteneur<Aquarium, INageur> aqua = new Conteneur<>(5);
        Dauphin dau = new Dauphin();
        aqua.ajouter(dau);
        System.out.println(aqua.getListe());

        Conteneur<Cage, IAnimal> cage = new Conteneur<Cage, IAnimal>(5);
        Chat chat = new Chat();
        cage.ajouter(chat);

        System.out.println(cage.getListe());

//        var test:Type = aqua.getClass().getGenericSuperclass();
//        test = ((ParameterizedType)test).getActualTypeArguments()[0];
//         System.out.println(test);


        Conteneur<Voliere, IVolatile> voliere = new Conteneur(5);

        Zoo z = new Zoo();
        z.addVoliere(voliere);
        System.out.println(z.getClass());
        Animaux lion = new Chat();


        z.getListeCage().get(0).ajouter(chat);
        z.getListeAquarium().get(0).ajouter(dau);
        z.getListeCage().get(0).checkConteneur();
        z.getListeCage().get(0).ajouter(lion);
        z.getListeCage().get(0).checkConteneur();
        System.out.println("nombre d'animaux dans le zoo : " + Animaux.compteur);




        //Impossible de mettre un chat dans un aquarium ne pas oublier de definir
        //    le type d'objet et le type d'attibut en instanciant un nouveau Conteneur
/*        aqua.ajouter(chat);
        System.out.println(aqua.getListe());


        //Mauvaise pratique difinir
        Person p1 = new Person();
       aqua.ajouter(p1);
        System.out.println(aqua.getListe());
*/
    }
}
