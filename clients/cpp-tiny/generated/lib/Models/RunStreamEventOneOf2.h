
/*
 * RunStreamEvent_oneOf_2.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.
 */

#ifndef TINY_CPP_CLIENT_RunStreamEvent_oneOf_2_H_
#define TINY_CPP_CLIENT_RunStreamEvent_oneOf_2_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunObject.h"

namespace Tiny {


/*! \brief Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
 *
 *  \ingroup Models
 *
 */

class RunStreamEvent_oneOf_2{
public:

    /*! \brief Constructor.
	 */
    RunStreamEvent_oneOf_2();
    RunStreamEvent_oneOf_2(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStreamEvent_oneOf_2();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getEvent();

	/*! \brief Set 
	 */
	void setEvent(std::string  event);
	/*! \brief Get 
	 */
	RunObject getData();

	/*! \brief Set 
	 */
	void setData(RunObject  data);


    private:
    std::string event{};
    RunObject data;
};
}

#endif /* TINY_CPP_CLIENT_RunStreamEvent_oneOf_2_H_ */
