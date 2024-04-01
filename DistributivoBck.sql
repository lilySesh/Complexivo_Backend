PGDMP  %    &                |            Distributivo    16.2    16.2 =               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16398    Distributivo    DATABASE     �   CREATE DATABASE "Distributivo" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Spain.1252';
    DROP DATABASE "Distributivo";
                postgres    false            �            1259    16439    Carrera    TABLE     �   CREATE TABLE public."Carrera" (
    id_carrera integer NOT NULL,
    car_nombre text,
    car_modalidad text,
    car_director text
);
    DROP TABLE public."Carrera";
       public         heap    postgres    false            �            1259    16432    Curso    TABLE     �   CREATE TABLE public."Curso" (
    id_curso integer NOT NULL,
    cur_nombre text,
    cur_jornada text,
    cur_ciclo text,
    cur_paralelo text
);
    DROP TABLE public."Curso";
       public         heap    postgres    false            �            1259    16459    CursoMateria    TABLE     }   CREATE TABLE public."CursoMateria" (
    "id_cursoMateria" integer NOT NULL,
    id_curso integer,
    id_materia integer
);
 "   DROP TABLE public."CursoMateria";
       public         heap    postgres    false            �            1259    16487    Distributivo    TABLE     �   CREATE TABLE public."Distributivo" (
    id_distributivo integer NOT NULL,
    "id_cursoMateria" integer,
    "id_uniAdm" integer,
    doc_horas_doc integer,
    doc_horas_adm integer
);
 "   DROP TABLE public."Distributivo";
       public         heap    postgres    false            �            1259    16511    DistributivoPeriodo    TABLE     �   CREATE TABLE public."DistributivoPeriodo" (
    id_dis_peri integer NOT NULL,
    id_distributivo integer,
    id_periodo integer
);
 )   DROP TABLE public."DistributivoPeriodo";
       public         heap    postgres    false            �            1259    16528    Docente    TABLE     �   CREATE TABLE public."Docente" (
    id_docente integer NOT NULL,
    id_persona integer,
    id_dis_peri integer,
    doc_titulo text,
    doc_tipo text,
    doc_horas integer
);
    DROP TABLE public."Docente";
       public         heap    postgres    false            �            1259    16446    Materia    TABLE     �   CREATE TABLE public."Materia" (
    id_materia integer NOT NULL,
    id_carrera integer,
    mat_nombre text,
    mat_horas text,
    mat_descripcion text
);
    DROP TABLE public."Materia";
       public         heap    postgres    false            �            1259    16504    PeriodoAcademico    TABLE     �   CREATE TABLE public."PeriodoAcademico" (
    id_periodo integer NOT NULL,
    peri_nombre text,
    peri_inicio text,
    peri_fin text,
    peri_estado boolean
);
 &   DROP TABLE public."PeriodoAcademico";
       public         heap    postgres    false            �            1259    16406    Persona    TABLE     �   CREATE TABLE public."Persona" (
    id_persona integer NOT NULL,
    per_cedula text,
    per_nombre text,
    per_apellido text,
    per_correo text,
    per_estado boolean
);
    DROP TABLE public."Persona";
       public         heap    postgres    false            �            1259    16399    Rol    TABLE     �   CREATE TABLE public."Rol" (
    id_rol integer NOT NULL,
    rol_nombre text,
    rol_descripcion text,
    rol_permisos text
);
    DROP TABLE public."Rol";
       public         heap    postgres    false            �            1259    16480    UnidadAdministrativa    TABLE     �   CREATE TABLE public."UnidadAdministrativa" (
    "id_uniAdm" integer NOT NULL,
    "uniAdm_nombre" text,
    "uniAdm_horas" integer,
    "uniAdm_descripcion" text
);
 *   DROP TABLE public."UnidadAdministrativa";
       public         heap    postgres    false            �            1259    16413    Usuario    TABLE     �   CREATE TABLE public."Usuario" (
    id_usuario integer NOT NULL,
    id_rol integer NOT NULL,
    id_persona integer NOT NULL,
    usu_usuario text,
    usu_clave text
);
    DROP TABLE public."Usuario";
       public         heap    postgres    false                      0    16439    Carrera 
   TABLE DATA           X   COPY public."Carrera" (id_carrera, car_nombre, car_modalidad, car_director) FROM stdin;
    public          postgres    false    219   iJ                 0    16432    Curso 
   TABLE DATA           ]   COPY public."Curso" (id_curso, cur_nombre, cur_jornada, cur_ciclo, cur_paralelo) FROM stdin;
    public          postgres    false    218   �J                 0    16459    CursoMateria 
   TABLE DATA           Q   COPY public."CursoMateria" ("id_cursoMateria", id_curso, id_materia) FROM stdin;
    public          postgres    false    221   MK       	          0    16487    Distributivo 
   TABLE DATA           w   COPY public."Distributivo" (id_distributivo, "id_cursoMateria", "id_uniAdm", doc_horas_doc, doc_horas_adm) FROM stdin;
    public          postgres    false    223   yK                 0    16511    DistributivoPeriodo 
   TABLE DATA           Y   COPY public."DistributivoPeriodo" (id_dis_peri, id_distributivo, id_periodo) FROM stdin;
    public          postgres    false    225   �K                 0    16528    Docente 
   TABLE DATA           i   COPY public."Docente" (id_docente, id_persona, id_dis_peri, doc_titulo, doc_tipo, doc_horas) FROM stdin;
    public          postgres    false    226   �K                 0    16446    Materia 
   TABLE DATA           c   COPY public."Materia" (id_materia, id_carrera, mat_nombre, mat_horas, mat_descripcion) FROM stdin;
    public          postgres    false    220   �L       
          0    16504    PeriodoAcademico 
   TABLE DATA           i   COPY public."PeriodoAcademico" (id_periodo, peri_nombre, peri_inicio, peri_fin, peri_estado) FROM stdin;
    public          postgres    false    224   �L                 0    16406    Persona 
   TABLE DATA           m   COPY public."Persona" (id_persona, per_cedula, per_nombre, per_apellido, per_correo, per_estado) FROM stdin;
    public          postgres    false    216   -M                 0    16399    Rol 
   TABLE DATA           R   COPY public."Rol" (id_rol, rol_nombre, rol_descripcion, rol_permisos) FROM stdin;
    public          postgres    false    215   �M                 0    16480    UnidadAdministrativa 
   TABLE DATA           t   COPY public."UnidadAdministrativa" ("id_uniAdm", "uniAdm_nombre", "uniAdm_horas", "uniAdm_descripcion") FROM stdin;
    public          postgres    false    222   �M                 0    16413    Usuario 
   TABLE DATA           [   COPY public."Usuario" (id_usuario, id_rol, id_persona, usu_usuario, usu_clave) FROM stdin;
    public          postgres    false    217   N       P           2606    16445    Carrera Carrera_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public."Carrera"
    ADD CONSTRAINT "Carrera_pkey" PRIMARY KEY (id_carrera);
 B   ALTER TABLE ONLY public."Carrera" DROP CONSTRAINT "Carrera_pkey";
       public            postgres    false    219            U           2606    16463    CursoMateria CursoMateria_pkey 
   CONSTRAINT     o   ALTER TABLE ONLY public."CursoMateria"
    ADD CONSTRAINT "CursoMateria_pkey" PRIMARY KEY ("id_cursoMateria");
 L   ALTER TABLE ONLY public."CursoMateria" DROP CONSTRAINT "CursoMateria_pkey";
       public            postgres    false    221            N           2606    16467    Curso Curso_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public."Curso"
    ADD CONSTRAINT "Curso_pkey" PRIMARY KEY (id_curso);
 >   ALTER TABLE ONLY public."Curso" DROP CONSTRAINT "Curso_pkey";
       public            postgres    false    218            a           2606    16515 ,   DistributivoPeriodo DistributivoPeriodo_pkey 
   CONSTRAINT     w   ALTER TABLE ONLY public."DistributivoPeriodo"
    ADD CONSTRAINT "DistributivoPeriodo_pkey" PRIMARY KEY (id_dis_peri);
 Z   ALTER TABLE ONLY public."DistributivoPeriodo" DROP CONSTRAINT "DistributivoPeriodo_pkey";
       public            postgres    false    225            [           2606    16491    Distributivo Distributivo_pkey 
   CONSTRAINT     m   ALTER TABLE ONLY public."Distributivo"
    ADD CONSTRAINT "Distributivo_pkey" PRIMARY KEY (id_distributivo);
 L   ALTER TABLE ONLY public."Distributivo" DROP CONSTRAINT "Distributivo_pkey";
       public            postgres    false    223            e           2606    16534    Docente Docente_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public."Docente"
    ADD CONSTRAINT "Docente_pkey" PRIMARY KEY (id_docente);
 B   ALTER TABLE ONLY public."Docente" DROP CONSTRAINT "Docente_pkey";
       public            postgres    false    226            R           2606    16452    Materia Materia_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public."Materia"
    ADD CONSTRAINT "Materia_pkey" PRIMARY KEY (id_materia);
 B   ALTER TABLE ONLY public."Materia" DROP CONSTRAINT "Materia_pkey";
       public            postgres    false    220            _           2606    16510 &   PeriodoAcademico PeriodoAcademico_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public."PeriodoAcademico"
    ADD CONSTRAINT "PeriodoAcademico_pkey" PRIMARY KEY (id_periodo);
 T   ALTER TABLE ONLY public."PeriodoAcademico" DROP CONSTRAINT "PeriodoAcademico_pkey";
       public            postgres    false    224            H           2606    16412    Persona Persona_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public."Persona"
    ADD CONSTRAINT "Persona_pkey" PRIMARY KEY (id_persona);
 B   ALTER TABLE ONLY public."Persona" DROP CONSTRAINT "Persona_pkey";
       public            postgres    false    216            F           2606    16405    Rol Rol_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public."Rol"
    ADD CONSTRAINT "Rol_pkey" PRIMARY KEY (id_rol);
 :   ALTER TABLE ONLY public."Rol" DROP CONSTRAINT "Rol_pkey";
       public            postgres    false    215            Y           2606    16486 .   UnidadAdministrativa UnidadAdministrativa_pkey 
   CONSTRAINT     y   ALTER TABLE ONLY public."UnidadAdministrativa"
    ADD CONSTRAINT "UnidadAdministrativa_pkey" PRIMARY KEY ("id_uniAdm");
 \   ALTER TABLE ONLY public."UnidadAdministrativa" DROP CONSTRAINT "UnidadAdministrativa_pkey";
       public            postgres    false    222            J           2606    16419    Usuario Usuario_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public."Usuario"
    ADD CONSTRAINT "Usuario_pkey" PRIMARY KEY (id_usuario);
 B   ALTER TABLE ONLY public."Usuario" DROP CONSTRAINT "Usuario_pkey";
       public            postgres    false    217            S           1259    16458    fki_id_carrera    INDEX     J   CREATE INDEX fki_id_carrera ON public."Materia" USING btree (id_carrera);
 "   DROP INDEX public.fki_id_carrera;
       public            postgres    false    220            V           1259    16473    fki_id_curso    INDEX     K   CREATE INDEX fki_id_curso ON public."CursoMateria" USING btree (id_curso);
     DROP INDEX public.fki_id_curso;
       public            postgres    false    221            \           1259    16497    fki_id_cursoMateria    INDEX     ]   CREATE INDEX "fki_id_cursoMateria" ON public."Distributivo" USING btree ("id_cursoMateria");
 )   DROP INDEX public."fki_id_cursoMateria";
       public            postgres    false    223            f           1259    16545    fki_id_dis_peri    INDEX     L   CREATE INDEX fki_id_dis_peri ON public."Docente" USING btree (id_dis_peri);
 #   DROP INDEX public.fki_id_dis_peri;
       public            postgres    false    226            b           1259    16521    fki_id_distributivo    INDEX     `   CREATE INDEX fki_id_distributivo ON public."DistributivoPeriodo" USING btree (id_distributivo);
 '   DROP INDEX public.fki_id_distributivo;
       public            postgres    false    225            W           1259    16479    fki_id_materia    INDEX     O   CREATE INDEX fki_id_materia ON public."CursoMateria" USING btree (id_materia);
 "   DROP INDEX public.fki_id_materia;
       public            postgres    false    221            c           1259    16527    fki_id_periodo    INDEX     V   CREATE INDEX fki_id_periodo ON public."DistributivoPeriodo" USING btree (id_periodo);
 "   DROP INDEX public.fki_id_periodo;
       public            postgres    false    225            K           1259    16431    fki_id_persona    INDEX     J   CREATE INDEX fki_id_persona ON public."Usuario" USING btree (id_persona);
 "   DROP INDEX public.fki_id_persona;
       public            postgres    false    217            L           1259    16425 
   fki_id_rol    INDEX     B   CREATE INDEX fki_id_rol ON public."Usuario" USING btree (id_rol);
    DROP INDEX public.fki_id_rol;
       public            postgres    false    217            ]           1259    16503    fki_id_uniAdm    INDEX     Q   CREATE INDEX "fki_id_uniAdm" ON public."Distributivo" USING btree ("id_uniAdm");
 #   DROP INDEX public."fki_id_uniAdm";
       public            postgres    false    223            j           2606    16468 '   CursoMateria CursoMateria_id_curso_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."CursoMateria"
    ADD CONSTRAINT "CursoMateria_id_curso_fkey" FOREIGN KEY (id_curso) REFERENCES public."Curso"(id_curso);
 U   ALTER TABLE ONLY public."CursoMateria" DROP CONSTRAINT "CursoMateria_id_curso_fkey";
       public          postgres    false    218    4686    221            k           2606    16474 )   CursoMateria CursoMateria_id_materia_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."CursoMateria"
    ADD CONSTRAINT "CursoMateria_id_materia_fkey" FOREIGN KEY (id_materia) REFERENCES public."Materia"(id_materia);
 W   ALTER TABLE ONLY public."CursoMateria" DROP CONSTRAINT "CursoMateria_id_materia_fkey";
       public          postgres    false    4690    220    221            n           2606    16516 <   DistributivoPeriodo DistributivoPeriodo_id_distributivo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."DistributivoPeriodo"
    ADD CONSTRAINT "DistributivoPeriodo_id_distributivo_fkey" FOREIGN KEY (id_distributivo) REFERENCES public."Distributivo"(id_distributivo);
 j   ALTER TABLE ONLY public."DistributivoPeriodo" DROP CONSTRAINT "DistributivoPeriodo_id_distributivo_fkey";
       public          postgres    false    225    4699    223            o           2606    16522 7   DistributivoPeriodo DistributivoPeriodo_id_periodo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."DistributivoPeriodo"
    ADD CONSTRAINT "DistributivoPeriodo_id_periodo_fkey" FOREIGN KEY (id_periodo) REFERENCES public."PeriodoAcademico"(id_periodo);
 e   ALTER TABLE ONLY public."DistributivoPeriodo" DROP CONSTRAINT "DistributivoPeriodo_id_periodo_fkey";
       public          postgres    false    225    224    4703            l           2606    16492 .   Distributivo Distributivo_id_cursoMateria_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."Distributivo"
    ADD CONSTRAINT "Distributivo_id_cursoMateria_fkey" FOREIGN KEY ("id_cursoMateria") REFERENCES public."CursoMateria"("id_cursoMateria");
 \   ALTER TABLE ONLY public."Distributivo" DROP CONSTRAINT "Distributivo_id_cursoMateria_fkey";
       public          postgres    false    223    4693    221            m           2606    16498 (   Distributivo Distributivo_id_uniAdm_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."Distributivo"
    ADD CONSTRAINT "Distributivo_id_uniAdm_fkey" FOREIGN KEY ("id_uniAdm") REFERENCES public."UnidadAdministrativa"("id_uniAdm");
 V   ALTER TABLE ONLY public."Distributivo" DROP CONSTRAINT "Distributivo_id_uniAdm_fkey";
       public          postgres    false    4697    222    223            p           2606    16540     Docente Docente_id_dis_peri_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."Docente"
    ADD CONSTRAINT "Docente_id_dis_peri_fkey" FOREIGN KEY (id_dis_peri) REFERENCES public."DistributivoPeriodo"(id_dis_peri);
 N   ALTER TABLE ONLY public."Docente" DROP CONSTRAINT "Docente_id_dis_peri_fkey";
       public          postgres    false    225    226    4705            q           2606    16535    Docente Docente_id_persona_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."Docente"
    ADD CONSTRAINT "Docente_id_persona_fkey" FOREIGN KEY (id_persona) REFERENCES public."Persona"(id_persona);
 M   ALTER TABLE ONLY public."Docente" DROP CONSTRAINT "Docente_id_persona_fkey";
       public          postgres    false    226    216    4680            i           2606    16453    Materia Materia_id_carrera_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."Materia"
    ADD CONSTRAINT "Materia_id_carrera_fkey" FOREIGN KEY (id_carrera) REFERENCES public."Carrera"(id_carrera);
 M   ALTER TABLE ONLY public."Materia" DROP CONSTRAINT "Materia_id_carrera_fkey";
       public          postgres    false    219    4688    220            g           2606    16426    Usuario Usuario_id_persona_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."Usuario"
    ADD CONSTRAINT "Usuario_id_persona_fkey" FOREIGN KEY (id_persona) REFERENCES public."Persona"(id_persona);
 M   ALTER TABLE ONLY public."Usuario" DROP CONSTRAINT "Usuario_id_persona_fkey";
       public          postgres    false    217    4680    216            h           2606    16420    Usuario Usuario_id_rol_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public."Usuario"
    ADD CONSTRAINT "Usuario_id_rol_fkey" FOREIGN KEY (id_rol) REFERENCES public."Rol"(id_rol);
 I   ALTER TABLE ONLY public."Usuario" DROP CONSTRAINT "Usuario_id_rol_fkey";
       public          postgres    false    217    215    4678               l   x�u�1�0�99�O���h���R#;��{7n©z�2#���M�Б�V-��ɷ&j�F���9�GK�5����X�,0G�L2�{_���֪���w6��g�1�(�0k         X   x�35��t��M,)-��K���I-JN-����L�r~��%�Ey��Υ�E%��N\FF���1y@%a���E ��E��@}@]1z\\\ �aY            x�3�42�4�2�45��4����� p�      	   %   x�3�4BKN##S.#N455�421������ N��            x�3�4�4�2�4�4����� 
         �   x�U��
�0�s�y]�/P�Pmm'�a���?v��n!���e�U�y.�2P��09dIp7�\%������
T�$A<��3p򔘲�׿��˼n���s~5e/���2�S���}�3�T�Y)J��F_��C����K)c}?i��)�7�         c   x�3�4�I�KI�K�L,VpL.)M�)VHIU(�O/J�ML�<�9������8?��<�(�˄�Ē38��$5�ǿ �(�$�,����Ԁ3X�_�+F��� �+      
   *   x�3�N�M-.)J̉��4202�%\F��1P<F��� �D�         I   x�3�4�N���<Π�̼��|�, �!=713G/9?���ˈ�
8K�2�3����|�� ��=... 7��         +   x�3�t�,JM.�/�0�3��,.#N���⒢|t�+F��� ��C         C   x�3�tI-N,*����WHIU�O+)O,J�421��q��8�3�R��S�K�2SS8�Є�b���� �o         )   x�3�4BK���H)-�2�4A(�4II�23����� �	4     