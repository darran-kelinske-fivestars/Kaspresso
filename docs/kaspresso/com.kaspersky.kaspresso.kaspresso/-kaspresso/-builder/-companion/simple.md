//[kaspresso](../../../../index.md)/[com.kaspersky.kaspresso.kaspresso](../../../index.md)/[Kaspresso](../../index.md)/[Builder](../index.md)/[Companion](index.md)/[simple](simple.md)



# simple  
[androidJvm]  
Brief description  




Simple (preconfigured with logging and flaky-safe features) [Builder](../index.md) for test environment configuration.



If you desire to override some variables in Configurator please use customize parameter here.



The example is:

class ComposeTest : TestCase(  
    kaspressoBuilder = Kaspresso.Builder.simple {  
        adbServer = CustomAdbServerImpl()  
    }  
)

In this case your implementation of ``adbServer`` will be used for initializing of all other variables. So, your implementation has a priority over the default implementation while using customize parameter for the overriding.



Otherwise, if you don't set custom implementation then default implementation of ``adbServer`` will be explored.



Please, be aware, that overridings like:

class ComposeTest : TestCase(  
    kaspressoBuilder = Kaspresso.Builder.simple().apply {  
        adbServer = CustomAdbServerImpl()  
    }  
)

don't give you desired effect! Yes, you have an possibility to use your custom ``adbServer``, but in all interceptors and other variables default implementation of ``adbServer`` will be exploring.



We strongly recommend to use ``apply`` construction in such cases as an updating of a list of interceptors or to change the order of interceptors in the list (for example, it are variables like ``viewActionWatcherInterceptors``, ``viewAssertionWatcherInterceptors``, etc).



@return the new instance of [Builder](../index.md).



  
Content  
fun [simple](simple.md)(customize: [Kaspresso.Builder](../index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Kaspresso.Builder](../index.md)  



