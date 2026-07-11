<div align="center">

# WYang's Tech Notes

**以 GitHub Issues 记录学习过程、工程实践与问题排查。**

[![GitHub Issues](https://img.shields.io/github/issues/WYang2018fly/me?style=flat-square&color=0F6FFF)](https://github.com/WYang2018fly/me/issues)
[![GitHub Stars](https://img.shields.io/github/stars/WYang2018fly/me?style=flat-square&color=0F6FFF)](https://github.com/WYang2018fly/me/stargazers)
[![Last Commit](https://img.shields.io/github/last-commit/WYang2018fly/me?style=flat-square&color=0F6FFF)](https://github.com/WYang2018fly/me/commits/master)

[全部文章](https://github.com/WYang2018fly/me/issues) · [分类标签](https://github.com/WYang2018fly/me/labels) · [最新发布](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+sort%3Acreated-desc)

</div>

---

## 关于这个博客

这是我的个人技术博客与长期知识库，文章统一以 GitHub Issue 的形式发布。

我主要记录后端开发、云原生、Linux、数据库、IoT/AIoT 与 AI 应用开发等方向的学习和实践。内容既包括基础知识梳理，也包括真实环境中的安装部署、代码实现、问题排查与实践总结。

我的记录原则是：

- 从实际问题出发，而不是只整理概念；
- 尽量保留完整的操作步骤、代码和验证过程；
- 对踩坑、失败原因和适用边界进行说明；
- 持续修订旧文章，让知识能够长期复用。

> 本仓库中的 Issue 处于 Open 状态，通常表示文章仍会持续维护，并不代表内容尚未完成。标有 `TODO` 或 `未完` 的文章才表示仍在整理中。

## 当前学习方向

目前重点关注 **Backend to AIoT**：从传统后端开发出发，逐步将大模型、Agent、向量数据库和 RAG 能力应用到 IoT 设备运维、告警分析、工单处理与知识库问答中。

### Backend to AIoT 应用实践

| 阶段 | 文章 | 主要内容 |
| --- | --- | --- |
| P1 | [DeepSeek API Integration](https://github.com/WYang2018fly/me/issues/78) | 使用大模型 API 实现故障诊断、手册摘要、NL2SQL、告警分析和工单分类 |
| P2 | [LangChain & Agent](https://github.com/WYang2018fly/me/issues/79) | Prompt 模板、结构化输出、工具调用和 IoT 智能运维 Agent |
| P3 | [Embedding & Vector DB](https://github.com/WYang2018fly/me/issues/80) | BGE Embedding、余弦相似度、Milvus Lite 与语义搜索 |
| P4 | [RAG Pipeline](https://github.com/WYang2018fly/me/issues/81) | 使用 DeepSeek、BGE 和 Milvus 构建设备知识库问答系统 |

[查看全部 AIoT 文章](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3AAIoT)

## 内容分类

| 分类 | 主要内容 | 入口 |
| --- | --- | --- |
| AIoT 与 AI 应用 | DeepSeek API、LangChain、Agent、Embedding、Milvus、RAG | [AIoT](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3AAIoT) |
| 后端与编程语言 | Java、JavaScript、Node.js、Python、Go | [Java](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3AJava) · [Node](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3ANode) · [Python](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3APython) · [Go](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3AGolang) |
| 云原生与容器 | Docker、Docker Swarm、Kubernetes、K3s、Ingress | [Docker](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3ADocker) · [Kubernetes](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3AKubernetes) · [K3s](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3AK3s) |
| Linux 与运维 | Ubuntu、Shell、SSH、系统操作与文本处理 | [Ubuntu](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3AUbuntu) |
| Web 与微服务 | Nginx、Traefik、Kong、反向代理与 API Gateway | [Nginx](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3ANginx) · [API Gateway](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3A%22API+Gateway%22) · [Kong](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3AKong) |
| 数据库与中间件 | MongoDB、时序数据库、消息队列、ZooKeeper | [MongoDB](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3AMongoDB) · [TSDB](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3ATSDB) · [Message Queue](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3A%22Message+Queue%22) |
| 工程实践 | Git、重构、接口压测、认证与单点登录 | [Git](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3AGit) · [Refactor](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3ARefactor) · [SSO](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3ASSO) |
| 计算机基础 | 计算机组成原理、总线、存储器与高速缓存 | [POCC](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3APOCC) |

## 精选专题

### Kubernetes 实践路线

从云端集群初体验、本地环境搭建、服务部署和 Ingress，到生产环境准备、持久化存储与轻量级 K3s，记录完整的 Kubernetes 学习过程。

- [初试 TKE](https://github.com/WYang2018fly/me/issues/27)
- [本地搭建 Kubernetes](https://github.com/WYang2018fly/me/issues/28)
- [再战 TKE：服务间调用实践](https://github.com/WYang2018fly/me/issues/29)
- [本地部署服务](https://github.com/WYang2018fly/me/issues/31)
- [关于 Ingress](https://github.com/WYang2018fly/me/issues/32)
- [准备生产环境](https://github.com/WYang2018fly/me/issues/35)
- [生产环境搭建](https://github.com/WYang2018fly/me/issues/36)
- [Ingress 使用](https://github.com/WYang2018fly/me/issues/37)
- [轻量级 Kubernetes：K3s](https://github.com/WYang2018fly/me/issues/38)
- [PV 与 PVC](https://github.com/WYang2018fly/me/issues/59)

### MongoDB 学习笔记

围绕文档模型、事务、变更流、分片和运维等主题，整理 MongoDB 从基础设计到集群机制的学习过程。

[查看 MongoDB 专题](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3AMongoDB+sort%3Acreated-asc)

### Linux、Docker 与服务部署

记录 Shell、SSH、系统管理、Docker Swarm、Nginx、Traefik 和 Kong Gateway 等日常开发与运维实践。

- [服务器指纹变更导致 SSH 无法登录](https://github.com/WYang2018fly/me/issues/77)
- [Docker Service](https://github.com/WYang2018fly/me/issues/49)
- [Nginx 入门](https://github.com/WYang2018fly/me/issues/46)
- [Kong Gateway Quickstart](https://github.com/WYang2018fly/me/issues/76)

## 如何阅读

- 想按时间浏览：进入 [全部 Issues](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+sort%3Acreated-desc)
- 想按技术方向查找：进入 [Labels](https://github.com/WYang2018fly/me/labels)
- 想查看当前重点：从 [AIoT 专题](https://github.com/WYang2018fly/me/issues?q=is%3Aissue+label%3AAIoT) 开始
- 发现错误或有不同理解：欢迎在对应文章下留言讨论

## 文章结构

后续文章会尽量按照以下结构整理：

1. 背景与问题
2. 核心概念
3. 环境与前置条件
4. 实现或排查过程
5. 核心代码与配置解析
6. 问题排查
7. 验证方式
8. 实践总结与后续方向

## 关于我

后端软件工程师，关注 Java、云原生、IoT 平台与 AI Agent 应用开发。

我希望通过持续记录，把零散的学习过程整理为可以搜索、复用和迭代的工程知识。

[GitHub Profile](https://github.com/WYang2018fly)

---

<div align="center">

**Commit knowledge. Solve problems. Keep learning.**

</div>
