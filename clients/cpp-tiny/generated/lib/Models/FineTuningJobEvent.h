
/*
 * FineTuningJobEvent.h
 *
 * Fine-tuning job event object
 */

#ifndef TINY_CPP_CLIENT_FineTuningJobEvent_H_
#define TINY_CPP_CLIENT_FineTuningJobEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Object.h"

namespace Tiny {


/*! \brief Fine-tuning job event object
 *
 *  \ingroup Models
 *
 */

class FineTuningJobEvent{
public:

    /*! \brief Constructor.
	 */
    FineTuningJobEvent();
    FineTuningJobEvent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTuningJobEvent();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The object type, which is always \"fine_tuning.job.event\".
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always \"fine_tuning.job.event\".
	 */
	void setObject(std::string  object);
	/*! \brief Get The object identifier.
	 */
	std::string getId();

	/*! \brief Set The object identifier.
	 */
	void setId(std::string  id);
	/*! \brief Get The Unix timestamp (in seconds) for when the fine-tuning job was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the fine-tuning job was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The log level of the event.
	 */
	std::string getLevel();

	/*! \brief Set The log level of the event.
	 */
	void setLevel(std::string  level);
	/*! \brief Get The message of the event.
	 */
	std::string getMessage();

	/*! \brief Set The message of the event.
	 */
	void setMessage(std::string  message);
	/*! \brief Get The type of event.
	 */
	std::string getType();

	/*! \brief Set The type of event.
	 */
	void setType(std::string  type);
	/*! \brief Get The data associated with the event.
	 */
	Object getData();

	/*! \brief Set The data associated with the event.
	 */
	void setData(Object  data);


    private:
    std::string object{};
    std::string id{};
    int created_at{};
    std::string level{};
    std::string message{};
    std::string type{};
    Object data;
};
}

#endif /* TINY_CPP_CLIENT_FineTuningJobEvent_H_ */
