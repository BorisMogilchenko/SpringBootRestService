package ru.quazar.springboot.service;

import lombok.NoArgsConstructor;

import java.util.Collections;
import ru.quazar.springboot.model.CustomList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * param myList Collection ArrayList
 *
 * return Collections.min Minimum value of element collection/
 *
 * @version $Id: MinimumClass.java,v 1.0 2019-08-27 23:30:42 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 */

@NoArgsConstructor
@Service
public class MinimumClass<T extends Comparable<T>> {
    /**
     * Find element with minimum value
     *
     * @param myList Collection of integer elements
     * @return Element with minimum value
     */
    @Autowired     T minElement(CustomList myList) {
        return (T) Collections.min(myList.getList());
    }
}
