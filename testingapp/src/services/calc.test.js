import { describe, expect, it } from "vitest";
import { add,mul } from "./calc";

//test sute
describe('test suite for calc', () => {

    //test case
    it('should return 20 if a=10 and b=10', () => {
        expect(add(10, 10)).toBe(20);
    })
    //test case
    it('should return 20 if a=10 and b=10', () => {
        expect(mul(10, 10)).toBe(100);
    })
});