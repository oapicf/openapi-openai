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

/*
 * OAIImagesResponse.h
 *
 * 
 */

#ifndef OAIImagesResponse_H
#define OAIImagesResponse_H

#include <QJsonObject>

#include "OAIImage.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIImage;

class OAIImagesResponse : public OAIObject {
public:
    OAIImagesResponse();
    OAIImagesResponse(QString json);
    ~OAIImagesResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getCreated() const;
    void setCreated(const qint32 &created);
    bool is_created_Set() const;
    bool is_created_Valid() const;

    QList<OAIImage> getData() const;
    void setData(const QList<OAIImage> &data);
    bool is_data_Set() const;
    bool is_data_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 m_created;
    bool m_created_isSet;
    bool m_created_isValid;

    QList<OAIImage> m_data;
    bool m_data_isSet;
    bool m_data_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIImagesResponse)

#endif // OAIImagesResponse_H
