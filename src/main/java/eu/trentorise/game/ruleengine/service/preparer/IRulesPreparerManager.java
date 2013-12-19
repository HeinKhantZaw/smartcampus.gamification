package eu.trentorise.game.ruleengine.service.preparer;

import eu.trentorise.game.plugin.GamificationPluginIdentifier;
import eu.trentorise.game.ruleengine.service.IKnowledgeBuilder;


/**
 *
 * @author Luca Piras
 */
public interface IRulesPreparerManager {
    
    public void prepareRules(IKnowledgeBuilder kbuilder, 
                             GamificationPluginIdentifier gamificationApproachId);
}