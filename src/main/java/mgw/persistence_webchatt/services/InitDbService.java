//package esic.persistence.services;
//
//import java.math.BigDecimal;
//import java.text.ParseException;
//import java.util.ArrayList;
//import java.util.Collection;
//
//import javax.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import esic.domaine.entities.Cours;
//import esic.domaine.entities.Cursus;
//import esic.domaine.entities.Module;
//import esic.domaine.tools.Validateur;
//import esic.persistence.repository.CursusRepository;
//import esic.persistence.repository.ModuleRepository;
//
//@Transactional
//@Service
//public class InitDbService {
//	
//	 @Autowired
//	 private CursusRepository cursusRepository;
//	 @Autowired
//	 private ModuleRepository moduleRepository;
//
//@PostConstruct
//public void init() throws ParseException{
//	 Collection<Module> moduleCollection=new ArrayList<>();	
//    //Module m1=new Module(libelleModule, date, duree, descriptifModule, cursusCollection, coursCollection)
//    Module m1=new Module("MERISE", Validateur.convertStringFrToDate("18/11/2017"), new BigDecimal(350), "Historique de MERISE, Modélisation des bases de données relationnelles, les 3 niveaux d'abstraction dans Merise, les contraintes d'intégrité fonctionnelle", new ArrayList<>(),new ArrayList<>() );
//    Module m2=new Module("UML", Validateur.convertStringFrToDate("12/01/2018"), new BigDecimal(450), "Historique d'UML, Les Différents Diagrammes UML (Uses-case, Classes, Séquence,...)", new ArrayList<>(),new ArrayList<>() );
//    Module m3=new Module("JAVA", Validateur.convertStringFrToDate("O9/02/2018"), new BigDecimal(300), "Historique de JAVA, Le Concept Objet, Héritage et Polymorphisme, les classes Génériques", new ArrayList<>(),new ArrayList<>() );
//    Module m4=new Module("LA PERSISTENCE DES DONNEES", Validateur.convertStringFrToDate("05/03/2018"), new BigDecimal(250), "Historique de JPA et d'HIBERNATE, ORM Object Relational Mapinges" , new ArrayList<>(),new ArrayList<>() );
//    Module m5=new Module("JAVA SWING et JAVA FX, Le pattern MVC", Validateur.convertStringFrToDate("23/04/2018"), new BigDecimal(350), "Historique des Standard JEE, La Programmation Modulaire et l'Architecture N-Tiers, Les EJB, les JSP, Le conteneur SPRING CORE, Spring MVC, les JSF", new ArrayList<>(),new ArrayList<>() );
//    Module m6=new Module("JAVA EE", Validateur.convertStringFrToDate("23/04/2018"), new BigDecimal(350), "Historique des Standard JEE, La Programmation Modulaire et l'Architecture N-Tiers, Les EJB, les JSP, Le conteneur SPRING CORE, Spring MVC, les JSF", new ArrayList<>(),new ArrayList<>() );
//    moduleCollection.add(m1);
//    moduleCollection.add(m2);
//    moduleCollection.add(m3);
//    moduleCollection.add(m4);
//    moduleCollection.add(m5);
//    moduleCollection.add(m6);
//    //Cursus c1 = new Cursus(libelleCursus, annee, dateDeb, dateFin, detail, moduleCollection, tjSInscrireCollection)	
//    Cursus c1 = new Cursus("CONCEPTEUR DEVELOPPEUR JAVA EE", 2017,Validateur.convertStringFrToDate("15/09/2017"), Validateur.convertStringFrToDate("25/06/2018"),"- CCP1 : développer la persistance des données - CCP2:Développer des composants d'interface IHM - CCP3:Développer une architecture N-TIERS",moduleCollection,new ArrayList<>());
//   
//    
//    Cursus c2 = new Cursus("DEVELOPPEUR WEB", 2018,Validateur.convertStringFrToDate("08/01/2018"), Validateur.convertStringFrToDate("25/03/2018"),"- CCP1 : Designer des pages web - CCP2:valider les formulaires côté client",new ArrayList<>(),new ArrayList<>());
//   
//    
//    Cursus c3 = new Cursus("TECHNICIEN AUDIOVISUEL", 2017,Validateur.convertStringFrToDate("05/10/2017"), Validateur.convertStringFrToDate("26/07/2018"),"- CCP1 : Techniques de prise de vue et de son - CCP2:Mise en place d'une scène de tournage (éclairage, espace) - CCP3:Techniques de montage sonore et video",new ArrayList<>(),new ArrayList<>());
//    
//    
//    Cursus c4 = new Cursus("BTS COMPTABILITE", 2017,Validateur.convertStringFrToDate("20/10/2017"), Validateur.convertStringFrToDate("07/07/2018"),"ANGLAIS Commercial, GESTION, COMPTABILITE",new ArrayList<>(),new ArrayList<>());
//    
//
//    /*List<Cursus> cursuss = new ArrayList<Cursus>();
//    cursuss.add(c1);
//    cursuss.add(c2);
//    cursuss.add(c3);
//    cursuss.add(c4);
//    this.cursusRepository.save(cursuss);*/
//    //=========EQUIVALENT SANS CREATION D'UNE LISTE : ===========================
//    cursusRepository.save(c1);       
//    cursusRepository.save(c2);        
//    cursusRepository.save(c3);        
//    cursusRepository.save(c4);
//	
//}
//
//
//}
