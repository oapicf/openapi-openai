/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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


#include "OAIApiRouter.h"
#include "OAIOpenAIApiRequest.h"


namespace OpenAPI {

OAIApiRouter::OAIApiRouter() {
    createApiHandlers();
}

OAIApiRouter::~OAIApiRouter(){

}

void OAIApiRouter::createApiHandlers() { 
    mOAIOpenAIApiHandler = QSharedPointer<OAIOpenAIApiHandler>::create();
}


void OAIApiRouter::setOAIOpenAIApiHandler(QSharedPointer<OAIOpenAIApiHandler> handler){
    mOAIOpenAIApiHandler = handler;
}

void OAIApiRouter::setUpRoutes() {
    
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/chat/completions").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->createChatCompletionRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/completions").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->createCompletionRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/edits").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->createEditRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/embeddings").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->createEmbeddingRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/files").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->createFileRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fine-tunes").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->createFineTuneRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/images/generations").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->createImageRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/images/edits").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->createImageEditRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/images/variations").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->createImageVariationRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/moderations").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->createModerationRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/audio/transcriptions").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->createTranscriptionRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/audio/translations").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->createTranslationRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/files").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->listFilesRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fine-tunes").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->listFineTunesRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/models").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
            reqObj->listModelsRequest();
    });
}

void OAIApiRouter::processRequest(QHttpEngine::Socket *socket){
    if( handleRequest(socket) ){
        return;
    }
    if( handleRequestAndExtractPathParam(socket) ){
        return;
    }
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    if(socket->isOpen()){
        socket->writeHeaders();
        socket->close();
    }
}

bool OAIApiRouter::handleRequest(QHttpEngine::Socket *socket){
    auto reqPath = QString("%1 %2").arg(fromQHttpEngineMethod(socket->method())).arg(socket->path()).toLower();
    if ( Routes.contains(reqPath) ) {
        Routes.value(reqPath).operator()(socket);
        return true;
    }
    return false;
}

bool OAIApiRouter::handleRequestAndExtractPathParam(QHttpEngine::Socket *socket){
    auto reqPath = QString("%1 %2").arg(fromQHttpEngineMethod(socket->method())).arg(socket->path()).toLower();
    {
        auto completePath = QString("%1 %2").arg("POST").arg("/v1/fine-tunes/{fine_tune_id}/cancel").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString fine_tune_id = match.captured(QString("fine_tune_id").toLower());
                auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
                reqObj->cancelFineTuneRequest(fine_tune_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("DELETE").arg("/v1/files/{file_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString file_id = match.captured(QString("file_id").toLower());
                auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
                reqObj->deleteFileRequest(file_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("DELETE").arg("/v1/models/{model}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString model = match.captured(QString("model").toLower());
                auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
                reqObj->deleteModelRequest(model);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/files/{file_id}/content").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString file_id = match.captured(QString("file_id").toLower());
                auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
                reqObj->downloadFileRequest(file_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fine-tunes/{fine_tune_id}/events").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString fine_tune_id = match.captured(QString("fine_tune_id").toLower());
                auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
                reqObj->listFineTuneEventsRequest(fine_tune_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/files/{file_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString file_id = match.captured(QString("file_id").toLower());
                auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
                reqObj->retrieveFileRequest(file_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fine-tunes/{fine_tune_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString fine_tune_id = match.captured(QString("fine_tune_id").toLower());
                auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
                reqObj->retrieveFineTuneRequest(fine_tune_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/models/{model}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString model = match.captured(QString("model").toLower());
                auto reqObj = new OAIOpenAIApiRequest(socket, mOAIOpenAIApiHandler);
                reqObj->retrieveModelRequest(model);
                return true;
            }
        }
    }
    return false;
}

}