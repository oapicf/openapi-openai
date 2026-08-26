# frozen_string_literal: true

require 'spec_helper'

RSpec.describe OpenapiClient::Api::Threads::Runs do
  let(:client) { OpenapiClient::Client.new(base_url: 'https://api.openai.com/v1') }

  it 'is reachable and shares the client connection' do
    api = described_class.new(client.connection)
    expect(api).to be_a(described_class)
  end
end
