
/*
 * RunStreamEvent_oneOf_6.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) fails.
 */

#ifndef TINY_CPP_CLIENT_RunStreamEvent_oneOf_6_H_
#define TINY_CPP_CLIENT_RunStreamEvent_oneOf_6_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunObject.h"

namespace Tiny {


/*! \brief Occurs when a [run](/docs/api-reference/runs/object) fails.
 *
 *  \ingroup Models
 *
 */

class RunStreamEvent_oneOf_6{
public:

    /*! \brief Constructor.
	 */
    RunStreamEvent_oneOf_6();
    RunStreamEvent_oneOf_6(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStreamEvent_oneOf_6();


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

#endif /* TINY_CPP_CLIENT_RunStreamEvent_oneOf_6_H_ */
