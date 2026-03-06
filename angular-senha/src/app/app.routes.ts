import { Routes } from '@angular/router';
import { Client } from './shared/components/client/client';
import { User } from './shared/components/user/user';

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
