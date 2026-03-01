import { Routes } from '@angular/router';
import { Client } from './components/client/client';
import { User } from './components/user/user';

export const routes: Routes = [
    {
        path:"client",
        component: Client
    },
    {
        path:"user",
        component: User
    }
];
