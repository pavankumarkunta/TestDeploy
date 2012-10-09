package com.dst.demo.jsf;

import com.dst.demo.foo.Foo;
import org.springframework.roo.addon.jsf.managedbean.RooJsfManagedBean;
import org.springframework.roo.addon.serializable.RooSerializable;

@RooSerializable
@RooJsfManagedBean(entity = Foo.class, beanName = "fooBean")
public class FooBean {
}
