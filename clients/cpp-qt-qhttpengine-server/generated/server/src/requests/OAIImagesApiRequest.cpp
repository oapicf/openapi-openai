/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIHelpers.h"
#include "OAIImagesApiRequest.h"

namespace OpenAPI {

OAIImagesApiRequest::OAIImagesApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIImagesApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIImagesApiRequest::~OAIImagesApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIImagesApiRequest::~OAIImagesApiRequest()";
}

QMap<QString, QString>
OAIImagesApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIImagesApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIImagesApiRequest::getRawSocket(){
    return socket;
}


void OAIImagesApiRequest::createImageRequest(){
    qDebug() << "/v1/images/generations";
    connect(this, &OAIImagesApiRequest::createImage, handler.data(), &OAIImagesApiHandler::createImage);

    
 
    
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAICreateImageRequest oai_create_image_request;
    ::OpenAPI::fromJsonValue(oai_create_image_request, obj);
    

    Q_EMIT createImage(oai_create_image_request);
}


void OAIImagesApiRequest::createImageEditRequest(){
    qDebug() << "/v1/images/edits";
    connect(this, &OAIImagesApiRequest::createImageEdit, handler.data(), &OAIImagesApiHandler::createImageEdit);

    

    OAIHttpFileElement image;
    QString prompt;
    OAIHttpFileElement mask;
    OAICreateImageEditRequest_model model;
    qint32 n;
    QString size;
    QString response_format;
    QString user;

    Q_EMIT createImageEdit(image, prompt, mask, model, n, size, response_format, user);
}


void OAIImagesApiRequest::createImageVariationRequest(){
    qDebug() << "/v1/images/variations";
    connect(this, &OAIImagesApiRequest::createImageVariation, handler.data(), &OAIImagesApiHandler::createImageVariation);

    

    OAIHttpFileElement image;
    OAICreateImageEditRequest_model model;
    qint32 n;
    QString response_format;
    QString size;
    QString user;

    Q_EMIT createImageVariation(image, model, n, response_format, size, user);
}



void OAIImagesApiRequest::createImageResponse(const OAIImagesResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIImagesApiRequest::createImageEditResponse(const OAIImagesResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIImagesApiRequest::createImageVariationResponse(const OAIImagesResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIImagesApiRequest::createImageError(const OAIImagesResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIImagesApiRequest::createImageEditError(const OAIImagesResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIImagesApiRequest::createImageVariationError(const OAIImagesResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIImagesApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIImagesApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
