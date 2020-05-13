package mgw.persistence_webchatt.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mgw.domaine_webchatt.entities.Chatteur;
import mgw.persistence_webchatt.repository.ChatteurRepository;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

@Transactional
@Service
public class ChatteurService {

    @Autowired
    private ChatteurRepository chatteurRepository;

    //@Autowired 
    private Chatteur chatteur;

    //@Autowired
    public List<Chatteur> getAllChatteurs() {
        return this.chatteurRepository.findAll();
    }

    /**
     * retourne une liste pageable de Chatteur prête à la pagination
     *
     * @param p
     * @param s
     * @return
     */
    //@Autowired
    public Page<Chatteur> findAllChatteurPage(int p, int s) {
        return chatteurRepository.findAll(new PageRequest(p, s));//<=(int page, int size)				
    }

//    //@Autowired
//    public List<Module> findAllModulesOfChatteurByIdChatteur(Long idChatteur) {
//        Chatteur c = chatteurRepository.findOne(idChatteur);
//        return (List<Module>) c.getModuleCollection();
//    }
    //@Autowired
//    public Chatteur findChatteurBySessionId(String idChatteur) {
//        return chatteurRepository.findChatteurBySessionId(idChatteur);
//    }

    public Chatteur findChatteurById(Long idChatteur) {
        return chatteurRepository.findOne(idChatteur);
    }

    //@Autowired
    @Transactional
    public void saveOrUpdateChatteur(
            Chatteur chatteur,//from web view fields
            Chatteur chat) {//from original in DB
        if (chatteur == null && chat != null) {//cas d'update "direct" à partir de la base originale chat 
            chatteurRepository.save(chat);
        } else if (chat == null) {//cas de creation : chat est inexistant car il est à créer par saisies nouvelles
            chatteurRepository.save(chatteur);
        } else {//cas d'update
            this.chatteur = chat;//update Chatteur(libelleChatteur, annee, dateDeb, dateFin, detail, paypalId, prix1, prix2, moduleCollection, tjSInscrireCollection);
            chat.setSessionId(chatteur.getSessionId()); // <==ceci est un ID de session !!!!
            chat.setDateAdded(chatteur.getDateAdded());
            chat.setLogin(chatteur.getLogin());
            chat.setPathDle(chatteur.getPathDle());
            chat.setUsername(chatteur.getUsername());
//            chat.setMessageCollection(chatteur.getMessageCollection());

// LES ATTRIBUTS QUI SUIVENT SONT REMPLIS ET GERES PAR LA SUPER CLASSE "AbstractEntity.java":            
//            chat.setDatePersistence(chatteur.getDatePersistence());            
//            chat.setCssRawColorCode(chatteur.getCssRawColorCode());
//            chat.setUpdatedVersionDate(chatteur.getUpdatedVersionDate());            
//            
        }
    }

    //@Autowired
    public void deleteChatteur(Chatteur chat) {
        this.chatteur = chat;
        chatteurRepository.delete(chatteur);
    }
    
    
    public List<Chatteur> findChatteurByKeyWord(String search) {
        List<Chatteur> liste = (List<Chatteur>) chatteurRepository.findChatteurByKeyWord(search);
        return liste;
    }
    
//    public List<Chatteur> findChatteurByLoginAndPassword(String email, String password) {
//        return chatteurRepository.findChatteurByLoginAndPassword(email,password);
//    }
    
    public Chatteur findChatteurByLogin(String email) {
        return chatteurRepository.findChatteurByLogin(email);
    }

}
