# Tracking

The code architecture allows a simple method to be monitored.

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

# Usage

> App.java

```java
import com.azmisahin.*;

/**
 * Console Application
 */
class App{

    /**
     * Application Start
     * @param args Arguments
     */
    public static void main(String[] args){
        Trace.Debug("This Debug Message");
        Trace.Info("This Info Message");
        Trace.Warning("This Warning Message");
        Trace.Error("This Error Message");
    }
}
```
> Output

<span style="color:green">This Debug Message</span>
<span style="color:cyan">This Info Message</span>
<span style="color:yellow">This Warning Message</span>
<span style="color:red">This Error Message</span>