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

#ifndef OAI_OAIModelsApi_H
#define OAI_OAIModelsApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAIDeleteModelResponse.h"
#include "OAIListModelsResponse.h"
#include "OAIModel.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIModelsApi : public QObject {
    Q_OBJECT

public:
    OAIModelsApi(const int timeOut = 0);
    ~OAIModelsApi();

    void initializeServerConfigs();
    int setDefaultServerValue(int serverIndex,const QString &operation, const QString &variable,const QString &val);
    void setServerIndex(const QString &operation, int serverIndex);
    void setApiKey(const QString &apiKeyName, const QString &apiKey);
    void setBearerToken(const QString &token);
    void setUsername(const QString &username);
    void setPassword(const QString &password);
    void setTimeOut(const int timeOut);
    void setWorkingDirectory(const QString &path);
    void setNetworkAccessManager(QNetworkAccessManager* manager);
    int addServerConfiguration(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables = QMap<QString, OAIServerVariable>());
    void setNewServerForAllOperations(const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void setNewServer(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void addHeaders(const QString &key, const QString &value);
    void enableRequestCompression();
    void enableResponseCompression();
    void abortRequests();
    QString getParamStylePrefix(const QString &style);
    QString getParamStyleSuffix(const QString &style);
    QString getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode);

    /**
    * @param[in]  model QString [required]
    */
    virtual void deleteModel(const QString &model);


    virtual void listModels();

    /**
    * @param[in]  model QString [required]
    */
    virtual void retrieveModel(const QString &model);


private:
    QMap<QString,int> _serverIndices;
    QMap<QString,QList<OAIServerConfiguration>> _serverConfigs;
    QMap<QString, QString> _apiKeys;
    QString _bearerToken;
    QString _username;
    QString _password;
    int _timeOut;
    QString _workingDirectory;
    QNetworkAccessManager* _manager;
    QMap<QString, QString> _defaultHeaders;
    bool _isResponseCompressionEnabled;
    bool _isRequestCompressionEnabled;
    OAIHttpRequestInput _latestInput;
    OAIHttpRequestWorker *_latestWorker;
    QStringList _latestScope;
    OauthCode _authFlow;
    OauthImplicit _implicitFlow;
    OauthCredentials _credentialFlow;
    OauthPassword _passwordFlow;
    int _OauthMethod = 0;

    void deleteModelCallback(OAIHttpRequestWorker *worker);
    void listModelsCallback(OAIHttpRequestWorker *worker);
    void retrieveModelCallback(OAIHttpRequestWorker *worker);

Q_SIGNALS:

    void deleteModelSignal(OAIDeleteModelResponse summary);
    void listModelsSignal(OAIListModelsResponse summary);
    void retrieveModelSignal(OAIModel summary);


    void deleteModelSignalFull(OAIHttpRequestWorker *worker, OAIDeleteModelResponse summary);
    void listModelsSignalFull(OAIHttpRequestWorker *worker, OAIListModelsResponse summary);
    void retrieveModelSignalFull(OAIHttpRequestWorker *worker, OAIModel summary);

    Q_DECL_DEPRECATED_X("Use deleteModelSignalError() instead")
    void deleteModelSignalE(OAIDeleteModelResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteModelSignalError(OAIDeleteModelResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listModelsSignalError() instead")
    void listModelsSignalE(OAIListModelsResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void listModelsSignalError(OAIListModelsResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use retrieveModelSignalError() instead")
    void retrieveModelSignalE(OAIModel summary, QNetworkReply::NetworkError error_type, QString error_str);
    void retrieveModelSignalError(OAIModel summary, QNetworkReply::NetworkError error_type, const QString &error_str);

    Q_DECL_DEPRECATED_X("Use deleteModelSignalErrorFull() instead")
    void deleteModelSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteModelSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use listModelsSignalErrorFull() instead")
    void listModelsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void listModelsSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use retrieveModelSignalErrorFull() instead")
    void retrieveModelSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void retrieveModelSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public Q_SLOTS:
    void tokenAvailable();
};

} // namespace OpenAPI
#endif
