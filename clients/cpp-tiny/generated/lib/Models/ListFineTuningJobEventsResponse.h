
/*
 * ListFineTuningJobEventsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ListFineTuningJobEventsResponse_H_
#define TINY_CPP_CLIENT_ListFineTuningJobEventsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FineTuningJobEvent.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ListFineTuningJobEventsResponse{
public:

    /*! \brief Constructor.
	 */
    ListFineTuningJobEventsResponse();
    ListFineTuningJobEventsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ListFineTuningJobEventsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<FineTuningJobEvent> getData();

	/*! \brief Set 
	 */
	void setData(std::list <FineTuningJobEvent> data);
	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);


    private:
    std::list<FineTuningJobEvent> data;
    std::string object{};
};
}

#endif /* TINY_CPP_CLIENT_ListFineTuningJobEventsResponse_H_ */
