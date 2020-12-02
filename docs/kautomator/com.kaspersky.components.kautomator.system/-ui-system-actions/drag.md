//[kautomator](../../index.md)/[com.kaspersky.components.kautomator.system](../index.md)/[UiSystemActions](index.md)/[drag](drag.md)



# drag  
[androidJvm]  
Brief description  


Performs a swipe from one coordinate to another coordinate. You can control the smoothness and speed of the swipe by specifying the number of steps. Each step execution is throttled to 5 milliseconds per step, so for a 100 steps, the swipe will take around 0.5 seconds to complete.



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| endX| <br><br>X-axis value for the ending coordinate<br><br>
| endY| <br><br>Y-axis value for the ending coordinate<br><br>
| startX| <br><br>X-axis value for the starting coordinate<br><br>
| startY| <br><br>Y-axis value for the starting coordinate<br><br>
| steps| <br><br>is the number of steps for the swipe action<br><br>
  
  
Content  
open fun [drag](drag.md)(startX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), startY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), endX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), endY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), steps: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  



