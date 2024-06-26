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

#include "OAIImagesApiHandler.h"
#include "OAIImagesApiRequest.h"

namespace OpenAPI {

OAIImagesApiHandler::OAIImagesApiHandler(){

}

OAIImagesApiHandler::~OAIImagesApiHandler(){

}

void OAIImagesApiHandler::createImage(OAICreateImageRequest oai_create_image_request) {
    Q_UNUSED(oai_create_image_request);
    auto reqObj = qobject_cast<OAIImagesApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIImagesResponse res;
        reqObj->createImageResponse(res);
    }
}
void OAIImagesApiHandler::createImageEdit(OAIHttpFileElement image, QString prompt, OAIHttpFileElement mask, OAICreateImageEditRequest_model model, qint32 n, QString size, QString response_format, QString user) {
    Q_UNUSED(image);
    Q_UNUSED(prompt);
    Q_UNUSED(mask);
    Q_UNUSED(model);
    Q_UNUSED(n);
    Q_UNUSED(size);
    Q_UNUSED(response_format);
    Q_UNUSED(user);
    auto reqObj = qobject_cast<OAIImagesApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIImagesResponse res;
        reqObj->createImageEditResponse(res);
    }
}
void OAIImagesApiHandler::createImageVariation(OAIHttpFileElement image, OAICreateImageEditRequest_model model, qint32 n, QString response_format, QString size, QString user) {
    Q_UNUSED(image);
    Q_UNUSED(model);
    Q_UNUSED(n);
    Q_UNUSED(response_format);
    Q_UNUSED(size);
    Q_UNUSED(user);
    auto reqObj = qobject_cast<OAIImagesApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIImagesResponse res;
        reqObj->createImageVariationResponse(res);
    }
}


}
