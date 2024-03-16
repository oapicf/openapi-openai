/*
 * FineTune.h
 *
 * 
 */

#ifndef _FineTune_H_
#define _FineTune_H_


#include <string>
#include "FineTuneEvent.h"
#include "OpenAIFile.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class FineTune : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTune();
	FineTune(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTune();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	int getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get 
	 */
	int getUpdatedAt();

	/*! \brief Set 
	 */
	void setUpdatedAt(int  updated_at);
	/*! \brief Get 
	 */
	std::string getModel();

	/*! \brief Set 
	 */
	void setModel(std::string  model);
	/*! \brief Get 
	 */
	std::string getFineTunedModel();

	/*! \brief Set 
	 */
	void setFineTunedModel(std::string  fine_tuned_model);
	/*! \brief Get 
	 */
	std::string getOrganizationId();

	/*! \brief Set 
	 */
	void setOrganizationId(std::string  organization_id);
	/*! \brief Get 
	 */
	std::string getStatus();

	/*! \brief Set 
	 */
	void setStatus(std::string  status);
	/*! \brief Get 
	 */
	std::string getHyperparams();

	/*! \brief Set 
	 */
	void setHyperparams(std::string  hyperparams);
	/*! \brief Get 
	 */
	std::list<OpenAIFile> getTrainingFiles();

	/*! \brief Set 
	 */
	void setTrainingFiles(std::list <OpenAIFile> training_files);
	/*! \brief Get 
	 */
	std::list<OpenAIFile> getValidationFiles();

	/*! \brief Set 
	 */
	void setValidationFiles(std::list <OpenAIFile> validation_files);
	/*! \brief Get 
	 */
	std::list<OpenAIFile> getResultFiles();

	/*! \brief Set 
	 */
	void setResultFiles(std::list <OpenAIFile> result_files);
	/*! \brief Get 
	 */
	std::list<FineTuneEvent> getEvents();

	/*! \brief Set 
	 */
	void setEvents(std::list <FineTuneEvent> events);

private:
	std::string id;
	std::string object;
	int created_at;
	int updated_at;
	std::string model;
	std::string fine_tuned_model;
	std::string organization_id;
	std::string status;
	std::string hyperparams;
	std::list <OpenAIFile>training_files;
	std::list <OpenAIFile>validation_files;
	std::list <OpenAIFile>result_files;
	std::list <FineTuneEvent>events;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTune_H_ */
