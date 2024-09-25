FROM node:16 AS build

WORKDIR /usr/src/app

COPY package*.json ./

RUN npm install

COPY . .

RUN npm run build --prod

FROM nginx:1.21-alpine

COPY --from=build /usr/src/app/dist/labseq-app /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]