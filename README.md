# mybatisPractice
# This project is just a practice project 
# create entities class in the [po] package and you should finish a .xml file to
# put SQL
# parameterType：
# 在映射文件中指定输入的类型
# resultType：
# 在映射文件中指定输出结果的类型
# #{}:表示一个占位符
# ${}：表示拼接符号，会引起sql注入，不建议使用
# selectOne：表示查询出一条数据，如果使用selectOne可以实现，那么使用selectList也可以实现
# selectList ：表示查询出多条记录