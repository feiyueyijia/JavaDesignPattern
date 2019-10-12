package com.yfny.pattern.abstracts.factory.example1.concreteFactory;

import com.yfny.pattern.abstracts.factory.example1.abstractFactory.SkinFactory;
import com.yfny.pattern.abstracts.factory.example1.abstractProduct.Button;
import com.yfny.pattern.abstracts.factory.example1.abstractProduct.ComboBox;
import com.yfny.pattern.abstracts.factory.example1.abstractProduct.TextField;
import com.yfny.pattern.abstracts.factory.example1.concreteProduct.spring.SpringButton;
import com.yfny.pattern.abstracts.factory.example1.concreteProduct.spring.SpringComboBox;
import com.yfny.pattern.abstracts.factory.example1.concreteProduct.spring.SpringTextField;

/**
 * Created by jisongZhou on 2019/10/12.
 **/
public class SpringSkinFactory implements SkinFactory {

    public Button createButton() {
        return new SpringButton();
    }

    public TextField createTextField() {
        return new SpringTextField();
    }

    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
