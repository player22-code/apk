# Smart Crypto Miner

Projeto Android independente. **Não usa Supabase nem o banco do site de namoro.**

## Estado
- Estrutura Android Kotlin e workflow de compilação em GitHub Actions.
- Protótipo de painel em `dashboard/index.html` (sem backend ou autenticação).
- Diagnóstico do dispositivo e interface de consentimento.
- **Ainda não há mineração real, telemetria em tempo real ou pagamentos ativos.**

## Trust Wallet
Endereço público EVM: `0xAeEB0bBeBfE22Fe328543F50702611CF0807A0AF`.

O arquivo `config/payouts.json` lista redes e ativos candidatos. **Todos estão desabilitados até verificar a rede na Trust Wallet e os termos da pool.** A carteira não recebe XMR/BTC nativos nesse endereço; minerar essas moedas exige endereço próprio ou conversão por pool.

## Segurança
Não publicar senha administrativa, frase-semente, chave privada ou tokens de API. O painel precisa de autenticação server-side e o minerador precisa de consentimento informado, botão de parada e proteção térmica. O app não deve iniciar mineração oculta ou sem autorização.

## Build
Verifique a aba **Actions** e baixe o artefato do workflow Android APK após uma execução bem-sucedida.
