##Spring-JPA-Practice

1) If Course has CourseMaterial and we are trying to store course and courseMaterial simultaneously it throw -
TransientPropertyValueException: object references an unsaved transient instance.
To fix this - add Cascading type to All.

2) Course and CourseMaterial is in one to one relationship.
we can save course without mentioning coursematerial, but to we want course material should always be set with course then add optional as false(check course entity)

3) Implemented OneToMany and ManyToOne Unidirectional Mappint


