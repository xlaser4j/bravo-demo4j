<h3 align=center> Bravo-Demos</h3>

#### Refactor-基于Martin的重构,记录<< Refactoring Improving the Design of Existing Code >>中的相关demo

> Any fool can write code that a computer can understand.Good programmers write code that humans can understand.
<p align=right>-- Martin Fowler</p>

- Chapter3 (code smell)
  - Duplicated Code-重复代码 
  - Long Method-过长的函数
  - Large Class-过大的类
  - Long Parameter List-过长的参数列
  - Divergent Change-发散式变化(一个类受多种变化的影响)
  - Shotgun Surgery-散弹式修改(一种变化引发多个类要修改)
  - Feature Envy-依恋情结(面向对象是将数据和对应的数据操作包装在一起,不要过多引用其他类的数据)
  - Data Clumps-数据泥团(重复字段/方法参数)
  - Primitive Obsession-基本类型偏执(面向对象思维)
  - Switch Statements-switch惊悚
  - Parallel Inheritance Hierarchies-平衡继承体系(Shotgun的特殊形式)
  - Lazy Class-冗赘类
  - Speculative Generality-夸夸其谈未来性(去除用不到的做法)
  - Temporary Field-令人迷惑的暂时字段
  - Message Chains-过度耦合的消息链(过长的层层调用)
  - Middle Man-中间人(过多的委托调用)
  - Inappropriate Intimacy-狎昵关系(过于交叉)
  - Alternative Classes with Different Interfaces-异曲同工的类
  - Incomplete Library Class-不完美的类库
  - Data Class-纯稚的数据类型(数据的操作封装在对象内)
  - Refused Bequest-被拒绝的遗赠(继承问题)
  - Comments-过多的注释

- Chapter6 (重新组织函数)
  - Extract Method (提炼函数)
  - Inline Method (内联函数)
  - Inline Temp (内联临时变量)
  - Replace Temp with Query (以查询取代临时变量)
  - Introduce Explaining Variable (引入解释性变量)
  - Split Temporary Variable (分解临时变量)
  - Remove Assignments to Parameters (移除对参数的赋值)
  - Replace Method with Method Object (以函数对象取代函数)
  - Substitute Algorithm (替换算法)
  

- Chapter7 (对象之间的搬移)
  - Move Method (搬移函数)
  - Move Field (搬移字段)
  - Extract Class (提炼类)
  - Inline Class (内联类,与提炼类相反)
  - Hide Delegate (隐藏委托关系)
  - Remove Middle Man (移除中间人,与隐藏委托关系相反)
  - Introduce Foreign Method (引入外加函数)
  - Introduce Local Extension (引入本地扩展,当外加函数过多时改为扩展类)
  

- Chapter8 (重新组织数据)
  - Self Encapsulate Field (自封装字段)
  - Replace Data Value with Object (以对象取代数据值)
  - Change Value to Reference (将值对象改为引用对象)
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
  -  ()
---
select  from
(
SELECT bs_serial_no no FROM branch_secretary bs WHERE  bs.bs_serial_no ='A061910' 
or
SELECT pa_serial_no  FROM personal_assistant pa WHERE pa.pa_serial_no = 'A061910' 
)

#### Common-积累开发中一些可以复用的类或者配置
- Response
- Exception
- Security
- Mapper.xml
- Ehcache.xml
- Logback.xml
---

#### Demo-积累开发中某些特殊的case
- Demo202002
- Demo202003
---

#### Excel
- TODO
---

#### Generator-记录mybatis的generator
- Mybatis
- Mybatis Plus