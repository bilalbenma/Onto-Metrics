package de.edu.rostock.ontologymetrics.owlapi.ontology.metric.basemetric.schemaknowledgebasemetric.schemametric;

import org.semanticweb.owlapi.metrics.AxiomCount;
import org.semanticweb.owlapi.model.OWLOntology;

import de.edu.rostock.ontologymetrics.owlapi.ontology.metric.basemetric.CountAxiomsMetric;
import de.edu.rostock.ontologymetrics.owlapi.ontology.metric.basemetric.CountTotalClassesMetric;

public class AxiomClassRatioMetric extends SchemaMetric {

    public AxiomClassRatioMetric(OWLOntology pOntology) {
	super(pOntology);
    }
	
    public Float getValue() {
    	
    	float count = new CountAxiomsMetric(ontology).getValue();
    	float classes = new CountTotalClassesMetric(ontology).getValue();
    	if (classes==0) {
    		return 0f;
    	} else {
    	return count/classes;
    	}
    }
    
    public String toString() {
	return "Axiom Class Ratio";
    }
}
