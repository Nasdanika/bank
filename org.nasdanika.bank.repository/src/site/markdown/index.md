# Nasdanika Bank

Nasdanika bank is a simple enough ECore bank domain model to use for demonstration purposes in different Nasdanika products. 

## Resources

* [Model documentation](modeldoc/index.html)
* JavaDoc
    * [Model](apidocs/model)
    * [Edit](apidocs/model)
    * [Editor](apidocs/model)
* [Sources](bank.zip)
* [Nasdanika.bank](Nasdanika.bank) - a sample model with several customers, accounts and transactions. It is also available as a resource in ``org.nasdanika.bank`` bundle.    

## P2 Repository

* ``https://www.nasdanika.org/products/bank/1.0.0-SNAPSHOT/repository``
* [Archived](org.nasdanika.bank.repository-1.0.0-SNAPSHOT.zip)

## How to use

### Eclipse editor

Install Nasdanika Bank feature. 

#### New model

* Select to New > Other > Nasdanika > Nasdanika Bank Model.
* Select Bank as the root object.

#### Nasdanika.bank model

* Download the model into an Eclipse project.
* Double-click on the model to open the editor.


### Load programmatically

org.eclipse.emf.ecore.xmi

```
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.bank.Bank;
import org.nasdanika.bank.BankPackage;

...

ResourceSet resourceSet = new ResourceSetImpl();
resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
resourceSet.getPackageRegistry().put(BankPackage.eNS_URI, BankPackage.eINSTANCE);
URI uri = URI.createPlatformPluginURI("org.nasdanika.bank/Nasdanika.bank", false);
Resource resource = resourceSet.getResource(uri, true);
Bank bank = (Bank) resource.getContents().iterator().next();
```

## How to contribute

As an open source project we use the [Fork and Pull Model](https://help.github.com/articles/about-collaborative-development-models/).
You can find more information about collaborative development at GitHub in this article - [Collaborating with issues and pull requests](https://help.github.com/categories/collaborating-with-issues-and-pull-requests).

When you contribute code, please make sure that the changes are clearly identifiable. In particular, avoid making non-functional changes in the code which you do not touch, 
e.g. auto-formatting of an entire compilation unit. 

