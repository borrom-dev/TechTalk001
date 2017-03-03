package com.angkorsuntrix.techtalk001

import org.mockito.Mockito

/**
 *
 * @author juancho.
 */
inline fun <reified T : Any> mock(): T = Mockito.mock(T::class.java)