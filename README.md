# Лабораторна робота: Java Decoder

Ця лабораторна робота представляє собою Java програму для розшифрування повідомлень, зашифрованих з використанням різних методів кодування. Програма реалізує два методи кодування: заміну голосних та заміну приголосних.

## Опис

У цій лабораторній роботі ми створили програму, яка може розшифрувати зашифровані повідомлення, використовуючи два основних методи кодування. Ваші вхідні повідомлення можуть містити слова, закодовані за допомогою наступних методів:

1. **Заміна голосних:**
   - Усі голосні (а, е, і, о, у) замінюються на відповідні числа: а=1, е=2, і=3, о=4, у=5.

2. **Заміна приголосних:**
   - Усі приголосні замінюються на наступні приголосні в алфавітному порядку.

## Розробка

Процес розробки був наступним:

1. **Створення класу Decoder:**
   - Розробив клас Decoder, який має методи для декодування за заміною голосних та за заміною приголосних.

2. **Використання регулярних виразів:**
   - Використав регулярні вирази для визначення методу кодування кожного слова в рядку.

3. **Використання StringBuilder:**
   - Застосував StringBuilder для ефективної маніпуляції рядками.

4. **Створення функції main:**
   - Реалізував функцію main для демонстрації роботи декодера на прикладах зашифрованих повідомлень.

5. **Тестування:**
   - Додав тести для перевірки функціональності декодера.

