# Refactor Demos

> 重构: 对软件内部结构的一种调整,目的是在不改变软件可观察行为的前提下,提高其可理解性,降低其修改成.

> 重构会把大对象拆成多个小对象,把大的函数拆成多个小的函数,这个时候重构就会增加调用层数,让人难以理解;但是就像一把
> 双刃剑,这些多出来的间接层也有对应的价值: 允许逻辑共享复用,更容易分开解释意图实现,隔离了变化,增加代码清晰度等.

> 小型函数优美动人,只要将相对独立的代码从大形函数提炼出来,就可以大大提高代码可读性.
---

#### Code Smell
- Duplicated Code-重复代码: 
> Extract Method, Pull Up Method, Form Template Method, Substitute Algorithm

- Long Method-过长的函数:
> Extract Method, Replace Temp with Query, Introduce Parameter Object, Preserve Whole Object, 
> Replace Method with Method Object, Decompose Conditional

- Large Class-过大的类:
> Extract Class, Extract Subclass, Extract Interface

- Long Parameter List-过长的参数列:
> Replace Parameter with Method, Preserve Whole Object, Introduce Parameter Object

- Divergent Change-发散式变化(一个类受多种变化的影响):
> Extract Class 

- Shotgun Surgery-散弹式修改(一种变化引发多个类要修改):
> Move Method, MOve Field, Inline Class

- Feature Envy-依恋情结(面向对象是将数据和对应的数据操作包装在一起,不要过多引用其他类的数据):
> Move Method, Extract Method

- Data Clumps-数据泥团(重复字段/方法参数):
> Extract Class, Preserve Whole Object, Introduce Parameter Object

- Primitive Obsession-基本类型偏执(面向对象思维):
> Replace Data Value with Object, Replace Type Code with Class, Replace Type Code with SubClass, 
> Replace Type Code with State/Strategy, Extract Class, Introduce Parameter Object, Replace Array with Object 

- Switch Statements-switch惊悚:
> Move Method, Replace Type Code with SubClass, Replace Type Code with State/Strategy,
> Replace Parameter with Explicit Methods, Replace Conditional with Polymorphism, Introduce Null Object

- Parallel Inheritance Hierarchies-平衡继承体系(Shotgun的特殊形式):
> Move Method, Move Field

- Lazy Class-冗赘类
> Collapse hierarchy, Inline Class

- Speculative Generality-夸夸其谈未来性(去除用不到的做法):
> Collapse hierarchy, Rename Method, Inline Class, Remove Parameter

- Temporary Field-令人迷惑的暂时字段:
> Extract Class, Introduce Null Object

- Message Chains-过度耦合的消息链(过长的层层调用):
> Hide Delegate, Extract Method, Move Method

- Middle Man-中间人(过多的委托调用):
> Remove Middle Man, InlineMethod, Replace Delegation with Inheritance

- Inappropriate Intimacy-狎昵关系(过于交叉):
> Move Method, Move Field, Change Bidirectional Association to Unidirectional, Extract class, 
> Hide Delegate, Replace Inheritance with Delegation

- Alternative Classes with Different Interfaces-异曲同工的类:
> Rename Method, Move Method, Extract Superclass

- Incomplete Library Class-不完美的类库:
> Introduce Foreign Method, Introduce Local Extension

- Data Class-纯稚的数据类型(数据的操作封装在对象内):
> Encapsulate Field, Encapsulate Collection, Remove Setting Method, Move Method, Extract Method, Hide Method 

- Refused Bequest-被拒绝的遗赠(继承问题):
> Replace Inheritance with Delegation, Push Down Method, Push Down Field

- Comments-过多的注释:
> Rename Method, Extract Method, Introduce Assertion
---









