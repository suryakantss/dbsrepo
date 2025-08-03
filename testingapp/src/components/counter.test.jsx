import React from "react";
import { render, screen } from "@testing-library/react";
import userEvent from "@testing-library/user-event";
import { describe, expect,it } from "vitest";
import { Counter } from "./counter";

describe("Counter", () => {

    it("increments counter on button click", async () => {
        render(<Counter></Counter>);
        let button = screen.getByRole("button", { name: /INC/ });
        let countervalue = screen.getByTestId("countervalue");
        expect(countervalue.textContent).toEqual("0");
        await userEvent.click(button);
        expect(countervalue.textContent).toEqual("1");
        await userEvent.click(button);
         expect(countervalue.textContent).toEqual("2");
        
    });


});