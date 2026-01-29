//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for FineTuningApi
void main() {
  // final instance = FineTuningApi();

  group('tests for FineTuningApi', () {
    // Immediately cancel a fine-tune job. 
    //
    //Future<FineTuningJob> cancelFineTuningJob(String fineTuningJobId) async
    test('test cancelFineTuningJob', () async {
      // TODO
    });

    // Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    //
    //Future<FineTuningJob> createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest) async
    test('test createFineTuningJob', () async {
      // TODO
    });

    // Get status updates for a fine-tuning job. 
    //
    //Future<ListFineTuningJobEventsResponse> listFineTuningEvents(String fineTuningJobId, { String after, int limit }) async
    test('test listFineTuningEvents', () async {
      // TODO
    });

    // List checkpoints for a fine-tuning job. 
    //
    //Future<ListFineTuningJobCheckpointsResponse> listFineTuningJobCheckpoints(String fineTuningJobId, { String after, int limit }) async
    test('test listFineTuningJobCheckpoints', () async {
      // TODO
    });

    // List your organization's fine-tuning jobs 
    //
    //Future<ListPaginatedFineTuningJobsResponse> listPaginatedFineTuningJobs({ String after, int limit }) async
    test('test listPaginatedFineTuningJobs', () async {
      // TODO
    });

    // Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    //
    //Future<FineTuningJob> retrieveFineTuningJob(String fineTuningJobId) async
    test('test retrieveFineTuningJob', () async {
      // TODO
    });

  });
}
