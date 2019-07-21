# ![Logo](media/favicon.png)

# Tracking

The code architecture allows a simple method to be monitored.

# How it was done?

* JDK Install
* Maven Install
* Maven Generate
```cmd
mvn -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.azmisahin -DartifactId=tracking
```

# Install

You must first set up
* git from https://git-scm.com/ 
* apache from https://maven.apache.org
* clone repository [ this ]
```cmd
git clone https://github.com/azmisahin/azmisahin-software-global-component-Tracking-java.git
cd azmisahin-software-global-component-Tracking-java
mvn compile
```