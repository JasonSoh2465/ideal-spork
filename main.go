package main

import (
	"fmt"
)

type User = struct {
		name string
		age int
	}

func test() [4]User {
	names := []string{"xuan ying", "eva", "ler yung", "hui ru"}
	ages := []int{16, 16, 16, 15}

	

	users := [4]User{}

	for i := range 4 {
		users[i] = User{names[i], ages[i]}
	}

	return users
}

func main() {
	users := test()

	for i, user := range users {
		fmt.Println(i, user.name)
	}
}