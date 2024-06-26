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
#include "OAIFilesApiRequest.h"

namespace OpenAPI {

OAIFilesApiRequest::OAIFilesApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIFilesApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIFilesApiRequest::~OAIFilesApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIFilesApiRequest::~OAIFilesApiRequest()";
}

QMap<QString, QString>
OAIFilesApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIFilesApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIFilesApiRequest::getRawSocket(){
    return socket;
}


void OAIFilesApiRequest::createFileRequest(){
    qDebug() << "/v1/files";
    connect(this, &OAIFilesApiRequest::createFile, handler.data(), &OAIFilesApiHandler::createFile);

    

    OAIHttpFileElement file;
    QString purpose;

    Q_EMIT createFile(file, purpose);
}


void OAIFilesApiRequest::deleteFileRequest(const QString& file_idstr){
    qDebug() << "/v1/files/{file_id}";
    connect(this, &OAIFilesApiRequest::deleteFile, handler.data(), &OAIFilesApiHandler::deleteFile);

    
    QString file_id;
    fromStringValue(file_idstr, file_id);
    

    Q_EMIT deleteFile(file_id);
}


void OAIFilesApiRequest::downloadFileRequest(const QString& file_idstr){
    qDebug() << "/v1/files/{file_id}/content";
    connect(this, &OAIFilesApiRequest::downloadFile, handler.data(), &OAIFilesApiHandler::downloadFile);

    
    QString file_id;
    fromStringValue(file_idstr, file_id);
    

    Q_EMIT downloadFile(file_id);
}


void OAIFilesApiRequest::listFilesRequest(){
    qDebug() << "/v1/files";
    connect(this, &OAIFilesApiRequest::listFiles, handler.data(), &OAIFilesApiHandler::listFiles);

    
    QString purpose;
    if(socket->queryString().keys().contains("purpose")){
        fromStringValue(socket->queryString().value("purpose"), purpose);
    }
    


    Q_EMIT listFiles(purpose);
}


void OAIFilesApiRequest::retrieveFileRequest(const QString& file_idstr){
    qDebug() << "/v1/files/{file_id}";
    connect(this, &OAIFilesApiRequest::retrieveFile, handler.data(), &OAIFilesApiHandler::retrieveFile);

    
    QString file_id;
    fromStringValue(file_idstr, file_id);
    

    Q_EMIT retrieveFile(file_id);
}



void OAIFilesApiRequest::createFileResponse(const OAIOpenAIFile& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFilesApiRequest::deleteFileResponse(const OAIDeleteFileResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFilesApiRequest::downloadFileResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFilesApiRequest::listFilesResponse(const OAIListFilesResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFilesApiRequest::retrieveFileResponse(const OAIOpenAIFile& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIFilesApiRequest::createFileError(const OAIOpenAIFile& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFilesApiRequest::deleteFileError(const OAIDeleteFileResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFilesApiRequest::downloadFileError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFilesApiRequest::listFilesError(const OAIListFilesResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFilesApiRequest::retrieveFileError(const OAIOpenAIFile& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIFilesApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFilesApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
