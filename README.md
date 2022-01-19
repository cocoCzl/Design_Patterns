# Design_Patterns 
## 设计模式_Java
## 设计原则
* **找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起**

把会变化的部分抽取出并封装起来，以便以后可以轻易的改动或者扩充此部分，而不影响不需要变化的其他部分
（让系统中某部分改变不会影响其他部分）
* **针对接口编程，而不是针对实现**

针对接口编程实际是针对超类编程。
* **多用组合，少用继承**
* **为了交互对象之间的松耦合设计而努力**

松耦合的设计之所以能让我们建立有弹性的OO系统，能够应对变化，是因为对象之间的相互依赖降到了最低