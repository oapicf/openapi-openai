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
 * OAIListFilesResponse.h
 *
 * 
 */

#ifndef OAIListFilesResponse_H
#define OAIListFilesResponse_H

#include <QJsonObject>

#include "OAIOpenAIFile.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIOpenAIFile;

class OAIListFilesResponse : public OAIObject {
public:
    OAIListFilesResponse();
    OAIListFilesResponse(QString json);
    ~OAIListFilesResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIOpenAIFile> getData() const;
    void setData(const QList<OAIOpenAIFile> &data);
    bool is_data_Set() const;
    bool is_data_Valid() const;

    QString getObject() const;
    void setObject(const QString &object);
    bool is_object_Set() const;
    bool is_object_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIOpenAIFile> m_data;
    bool m_data_isSet;
    bool m_data_isValid;

    QString m_object;
    bool m_object_isSet;
    bool m_object_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIListFilesResponse)

#endif // OAIListFilesResponse_H
