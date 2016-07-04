package org.nasdanika.bank.app;

import org.eclipse.emf.cdo.common.model.CDOPackageRegistry;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.nasdanika.cdo.CDOSessionInitializer;

//import org.nasdanika.bank.NasdanikaBankFactory;
//import org.nasdanika.bank.NasdanikaBankPackage;
//import org.nasdanika.bank.NasdanikaBank;

public class NasdanikaBankSessionInitializerComponent implements CDOSessionInitializer {
	
	@Override
	public void init(CDOSession session) {
		System.out.println("Initializing session");
		
		// Register packages
		CDOPackageRegistry packageRegistry = session.getPackageRegistry();
		// TODO - packageRegistry.putEPackage(NasdanikaBankPackage.eINSTANCE);
		
		// Populate with initial data if empty.
		CDOTransaction transaction = session.openTransaction();				
		try {
			CDOResource cRes = transaction.getOrCreateResource("/NasdanikaBank");
			if (cRes.getContents().isEmpty()) {
				// Create initial content
				// TODO - NasdanikaBank rootElement = NasdanikaBankFactory.eINSTANCE.createNasdanikaBank();
				// TODO - configure root and add sub-elements
				// TODO - cRes.getContents().add(rootElement);
			}
			
			transaction.commit();
			transaction.close();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}

}
