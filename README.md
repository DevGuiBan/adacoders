```markdown
# Comandos Git

## Identificando-se no Git:

```bash
git config --global user.name "DevGuiBan"
git config --global user.email guibandeira290@gmail.com
```

## Clonando repositório:

Selecionando local para clonagem:
```bash
cd C:\Users\kitsu\OneDrive\Área de Trabalho
git clone https://github.com/DevGuiBan/Java.git
```

## Iniciando o git no local desejado:

Selecionar local do repositório com o comando `cd`:
```bash
git init
```

## Modificações dos estados GIT:

Passando de modified para staged:
```bash
git add .\ada-init.md
```

Passando de staged para commit:
```bash
git commit -m 'descrição do commit'
```

Resgatar arquivos da área de Staged para Modified:
```bash
git restore --staged .\ada-init.md
```

## Verificando status do repositório:

Mostrar todas as modificações feitas:
```bash
git status
```

Mostrar as modificações feitas nas linhas dos arquivos:
```bash
git diff
git diff --staged
```

Mostrar log de commits feitos:
```bash
git log
```
```