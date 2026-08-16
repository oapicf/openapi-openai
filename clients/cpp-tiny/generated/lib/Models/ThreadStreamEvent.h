
/*
 * ThreadStreamEvent.h
 *
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 */

#ifndef TINY_CPP_CLIENT_ThreadStreamEvent_H_
#define TINY_CPP_CLIENT_ThreadStreamEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ThreadObject.h"

namespace Tiny {


/*! \brief Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 *
 *  \ingroup Models
 *
 */

class ThreadStreamEvent{
public:

    /*! \brief Constructor.
	 */
    ThreadStreamEvent();
    ThreadStreamEvent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ThreadStreamEvent();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Whether to enable input audio transcription.
	 */
	bool isEnabled();

	/*! \brief Set Whether to enable input audio transcription.
	 */
	void setEnabled(bool  enabled);
	/*! \brief Get 
	 */
	std::string getEvent();

	/*! \brief Set 
	 */
	void setEvent(std::string  event);
	/*! \brief Get 
	 */
	ThreadObject getData();

	/*! \brief Set 
	 */
	void setData(ThreadObject  data);


    private:
    bool enabled{};
    std::string event{};
    ThreadObject data;
};
}

#endif /* TINY_CPP_CLIENT_ThreadStreamEvent_H_ */
